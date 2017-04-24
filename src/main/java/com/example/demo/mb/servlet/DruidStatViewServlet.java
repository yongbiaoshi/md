package com.example.demo.mb.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

@WebServlet(urlPatterns = "/druid/*", // url
        initParams = { @WebInitParam(name = "allow", value = "127.0.0.1"), // IP白名单
                @WebInitParam(name = "loginUsername", value = "admin"), // 用户名
                @WebInitParam(name = "loginPassword", value = "admin"), // 密码
                @WebInitParam(name = "resetEnable", value = "false") // 禁用HTML页面上的“ResetAll”功能
        })
public class DruidStatViewServlet extends StatViewServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 7090165480499238936L;

}
