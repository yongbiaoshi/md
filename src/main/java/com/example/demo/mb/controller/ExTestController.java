package com.example.demo.mb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex")
public class ExTestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String ex(){
        throw new RuntimeException("测试异常！");
    }
}
