package com.example.demo.mb.log;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class ProIdConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        String bizId = ProIdManager.getId();
        return bizId;
    }

}
