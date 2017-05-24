package com.example.demo.mb.log;

import org.apache.commons.lang3.RandomStringUtils;

public class ProIdManager {
    // private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    // 使用可继承的线程局部变量，在子线程中继承值
    private static InheritableThreadLocal<String> local = new InheritableThreadLocal<>();
    // 线程前缀，最好不要有特殊字符，方便在日志系统中过滤
    private static final String PRO_ID_PREFIX = "PRO";

    public static String getId() {
        String id = local.get();
        if (id == null || "".equals(id)) {
            id = PRO_ID_PREFIX + RandomStringUtils.randomAlphanumeric(15);
            local.set(id);
        } else {
        }
        return id;
    }

    public static void remove() {
        local.remove();
    }
}
