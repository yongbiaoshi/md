package com.example.demo.mb.servlet;

import javax.servlet.annotation.WebServlet;

import ch.qos.logback.classic.ViewStatusMessagesServlet;

@WebServlet(urlPatterns = "/lbClassicStatus/*")
public class LogbackClassicViewStatusMessages extends ViewStatusMessagesServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 7282669713127654059L;
}
