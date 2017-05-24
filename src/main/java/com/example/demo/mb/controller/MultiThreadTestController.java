package com.example.demo.mb.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("multi")
@Slf4j
public class MultiThreadTestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String simple() {
        log.info("多线程简单测试开始。");
        int nThreads = 10;
        ExecutorService service = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < nThreads; i++) {
            service.execute(() -> {
                log.info("多线程简单测试-子线程：{}", Thread.currentThread().getName());
            });
        }
        return "success";
    }
}
