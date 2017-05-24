package com.example.demo.mb.task;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisConnectionUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RedisTestTask {

    private static final int N_THREADS = 10;
    @Resource
    StringRedisTemplate srt;

    @Scheduled(fixedDelay = 2000000)
    public void multiThreadTest() {
        final String testKey = "test";
        ConcurrentLinkedQueue<Long> queue = new ConcurrentLinkedQueue<>();
        ExecutorService service = Executors.newFixedThreadPool(N_THREADS);
        for (int i = 0; i < N_THREADS; i++) {
            service.execute(() -> {
                try {
                    Long r = srt.opsForValue().increment(testKey, 1L);
                    queue.add(r);
                } catch (Exception e) {
                    log.error("Redis Incr操作执行失败。错误信息：" + e.getMessage(), e);
                } finally {
                    // 多线程，线程内部需要手动释放。
                    RedisConnectionUtils.unbindConnection(srt.getConnectionFactory());
                }
            });
        }
        service.shutdown();
        try {
            boolean sr = service.awaitTermination(10, TimeUnit.SECONDS);
            if (sr) {
                if (log.isDebugEnabled()) {
                    log.debug("Redis Incr操作执行成功。key：{}，result：{}", testKey, queue);
                }
            } else {
                if (log.isDebugEnabled()) {
                    log.debug("Redis Incr操作执行超时。key：{}，result：{}", testKey, queue);
                }
            }
        } catch (InterruptedException e) {
            log.error("ExecutorService 等待出错，出错信息：" + e.getMessage(), e);
        }
    }

    @Scheduled(fixedDelay = 1000000)
    public void singleThreadTest() {
        final String testKey = "test";
        ConcurrentLinkedQueue<Long> queue = new ConcurrentLinkedQueue<>();
        try {
            for (int i = 0; i < N_THREADS; i++) {
                Long r = srt.opsForValue().increment(testKey, 1L);
                queue.add(r);
            }
            if (log.isDebugEnabled()) {
                log.debug("Redis Incr操作执行成功。key：{}，result：{}", testKey, queue);
            }
        } catch (Exception e) {
            log.error("Redis Incr操作执行失败。错误信息：" + e.getMessage(), e);
        }
    }

    @Scheduled(fixedDelay = 1000)
    public void exceptionTest() {
        final String testKey = "abc";
        try {
            srt.opsForValue().set(testKey, "abc");
            srt.opsForValue().increment(testKey, 1L);
        } catch (Exception e) {
            log.error("Redis Incr操作执行失败。"); // 因为测试用，所以省掉e的信息。
            throw new RuntimeException("Redis Incr操作执行失败。", e);
        }
    }
}
