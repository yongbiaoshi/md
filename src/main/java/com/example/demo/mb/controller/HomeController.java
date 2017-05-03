package com.example.demo.mb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mb.log.RequestIdManager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(){
        log.info("访问首页。RequestId：{}", RequestIdManager.getId());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = sdf.format(new Date());
        return "现在时间：" + now;
    }
}
