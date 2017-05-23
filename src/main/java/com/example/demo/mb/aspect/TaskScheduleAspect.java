package com.example.demo.mb.aspect;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisConnectionUtils;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class TaskScheduleAspect {

    @Resource
    RedisConnectionFactory redisConnectionFactory;

    @Pointcut(value = "@annotation(org.springframework.scheduling.annotation.Scheduled)")
    public void taskSchedule() {
    }

    @After("taskSchedule()")
    public void unbind(JoinPoint jp) {
        if (log.isDebugEnabled()) {
            log.debug("定时任务：{}", jp.getSignature());
        }
        try {
            RedisConnectionUtils.unbindConnection(redisConnectionFactory);
            if (log.isDebugEnabled()) {
                log.debug("释放定时任务中的Redis连接成功。");
            }
        } catch (Exception e) {
            log.error("释放定时任务中的Redis连接失败。失败信息：" + e.getMessage(), e);
        }
    }
}
