package com.example.demo.mb.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mb.model.po.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("req")
public class ReqBodyController {

    @RequestMapping(value = "body", method = RequestMethod.POST)
    public Map<String, String> reqBody(@RequestBody Map<String, String> req) {
        log.info("Request Body：{}", req);
        return req;
    }
    
    @RequestMapping(value = "form", method = RequestMethod.POST)
    public User formReq(User u) {
        log.info("Request：{}", u);
        return u;
    }
    
    @RequestMapping(value = "form/body", method = RequestMethod.POST)
    public String formReqBody(@RequestBody String req) {
        log.info("Request Body：{}", req);
        return req;
    }
    
}
