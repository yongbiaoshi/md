package com.example.demo.mb.log;

import java.util.UUID;

import org.springframework.util.StringUtils;

public class RequestIdManager {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static String getId() {
        String id = threadLocal.get();

        if (!StringUtils.hasText(id)) {
            id = UUID.randomUUID().toString().replace("-", "");
            threadLocal.set(id);
        } else {
        }
        return id;
    }

    public static void remove() {
        threadLocal.remove();
    }
}
