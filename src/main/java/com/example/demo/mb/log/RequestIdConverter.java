package com.example.demo.mb.log;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class RequestIdConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        String bizId = RequestIdManager.getId();
        return bizId;
    }

}
