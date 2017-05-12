package com.example.demo.mb.test;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonsTest {

    public static void print(String... args) {
        log.info("打印测试数据。");
        log.info(StringUtils.join(args));
    }
    
    public static void main(String[] args) {
        print("a", "b", "c", "d");
    }
}
