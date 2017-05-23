package com.example.demo.mb.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisConnectionUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedisUnbindInterceptor implements HandlerInterceptor {
    @Resource
    RedisConnectionFactory redisConnectionFactory;

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        try {
            RedisConnectionUtils.unbindConnection(redisConnectionFactory);
            if(log.isDebugEnabled()){
                log.debug("释放Redis连接成功。");
            }
        } catch (Exception e) {
            log.error("释放Redis连接错误。错误信息：" + e.getMessage(), e);
        }
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        return true;
    }

}
