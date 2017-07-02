package com.jin2ml.adoptpet.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserAuthInterceptor extends HandlerInterceptorAdapter
{
    public boolean preHandle(HttpServletRequest  request,HttpServletResponse  response,
            Object handler)
            throws Exception{
                return true;}
}
