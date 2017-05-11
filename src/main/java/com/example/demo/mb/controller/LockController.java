package com.example.demo.mb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("lock")
public class LockController {
    
    private static final String ID_LOCK_PREFIX = "lock_id_";
    
    @RequestMapping(value = "str", method = RequestMethod.GET)
    public String syncStr(@RequestParam(required = true) String id) throws InterruptedException {
        log.info("测试同步锁字符串：{}", id);
        //把String放入常量池，如果已经存在，返回常量池中的对象
        id = (ID_LOCK_PREFIX + id).intern();
        synchronized (id) {
            log.info("获得同步锁：{}", id);
            Thread.sleep(5000);
        }
        return "finish";
    }
}
