package com.example.demo.mb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.demo.mb.interceptor.LoggingInterceptor;
import com.example.demo.mb.interceptor.RedisUnbindInterceptor;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(loggingInterceptor());
        registry.addInterceptor(redisUnbindInterceptor());
    }

    @Bean
    public LoggingInterceptor loggingInterceptor() {
        return new LoggingInterceptor();
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("reqform").setViewName("reqbody");;
    }
    
    @Bean
    public RedisUnbindInterceptor redisUnbindInterceptor(){
        return new RedisUnbindInterceptor();
    }
}
