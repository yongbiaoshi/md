package com.example.demo.mb.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.mb.service.DemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public void doSomething() {
        log.info("调用Service");
    }

}
