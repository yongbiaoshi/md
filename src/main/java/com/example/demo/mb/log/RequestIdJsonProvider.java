package com.example.demo.mb.log;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;

import ch.qos.logback.classic.spi.ILoggingEvent;
import net.logstash.logback.composite.AbstractFieldJsonProvider;
import net.logstash.logback.composite.FieldNamesAware;
import net.logstash.logback.fieldnames.LogstashFieldNames;

public class RequestIdJsonProvider extends AbstractFieldJsonProvider<ILoggingEvent>
        implements FieldNamesAware<LogstashFieldNames> {
    public static final String FIELD_LOGGER_NAME = "req_id";
    @Override
    public void writeTo(JsonGenerator generator, ILoggingEvent event) throws IOException {
        
    }

    @Override
    public void setFieldNames(LogstashFieldNames fieldNames) {
        
    }

}
