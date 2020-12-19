package com.example.springboot.config;

import org.apache.catalina.Session;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession();
        String username=(String) session.getAttribute("username");
        if(username==null)
        {
            request.setAttribute("msg","没有权限,请登陆");
            request.getRequestDispatcher("/").forward(request,response);
        }
        return true;

    }
}
