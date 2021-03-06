package com.example.demo.mb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.demo.mb.servlet")
@MapperScan(basePackages = "com.example.demo.mb.dao.mapper")
@EnableAsync
public class MbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbApplication.class, args);
    }
}
