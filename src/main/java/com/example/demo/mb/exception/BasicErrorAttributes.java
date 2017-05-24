package com.example.demo.mb.exception;

import java.util.Map;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

@Component
public class BasicErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(requestAttributes, includeStackTrace);
        addCustomeError(errorAttributes, requestAttributes);
        return errorAttributes;
    }

    private void addCustomeError(Map<String, Object> errorAttributes, RequestAttributes requestAttributes) {
        errorAttributes.put("result", "error");
        Throwable error = getError(requestAttributes);
        if (error instanceof AppException) {
            AppException ae = (AppException) error;
            errorAttributes.put("errorCode", ae.getErrorCode());
        }
    }
}
