package com.example.demo.mb.controller;

import java.util.Objects;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("redis")
@Slf4j
public class RedisTestController {

    @Resource
    RedisTemplate<String, Object> redisTemplate;
    @Resource
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get(String key) {
        String value = Objects.toString(redisTemplate.opsForValue().get(key), "");
        if (log.isDebugEnabled()) {
            log.debug("查询结果-key：{}，value：{}", key, value);
        }
        return value;
    }

    @RequestMapping(value = "set", method = RequestMethod.GET)
    public String set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return "success";
    }

    @RequestMapping(value = "incr", method = RequestMethod.GET)
    public Long incr(String key) {
        Long r = stringRedisTemplate.opsForValue().increment(key, 1L);
        return r;
    }
}
