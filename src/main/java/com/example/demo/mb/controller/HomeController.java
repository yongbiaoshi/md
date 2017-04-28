package com.example.demo.mb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mb.service.DemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {

    @Resource
    DemoService demoService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = sdf.format(new Date());
        return "现在时间：" + now;
    }

    @RequestMapping(value = "ping", method = RequestMethod.GET)
    public String ping(String p) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = sdf.format(new Date());
        log.info("访问测试页面，参数：p={}", p);
        // 调用Service示例
        demoService.doSomething();
        return "现在时间：" + now;
    }
}
