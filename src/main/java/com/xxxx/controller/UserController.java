package com.xxxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("key","hello springboot");
        return "hello";
    }
}
