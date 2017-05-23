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

    private static final int N_THREADS = 100;
    @Resource
    StringRedisTemplate srt;

    @Scheduled(fixedDelay = 50000)
    public void incrTest() {
        final String testKey = "test";
        ConcurrentLinkedQueue<Long> queue = new ConcurrentLinkedQueue<>();
        ExecutorService service = Executors.newFixedThreadPool(N_THREADS);
        for (int i = 0; i < N_THREADS; i++) {
            service.execute(() -> {
                try {
                    Long r = srt.opsForValue().increment(testKey, 1L);
                    queue.add(r);
                    RedisConnectionUtils.unbindConnection(srt.getConnectionFactory());
                } catch (Exception e) {
                    log.error("Redis Incr操作执行失败。错误信息：" + e.getMessage(), e);
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
                    log.debug("Redis Incr操作执行超时。key：{}", testKey);
                }
            }
        } catch (InterruptedException e) {
            log.error("ExecutorService 等待出错，出错信息：" + e.getMessage(), e);
        }
    }
}
