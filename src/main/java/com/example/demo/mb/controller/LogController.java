package com.example.demo.mb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("log")
public class LogController {

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get() {
        return "success";
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    public String post() {
        return "success";
    }
}
