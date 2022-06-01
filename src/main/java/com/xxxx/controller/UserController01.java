package com.xxxx.controller;

import com.xxxx.po.Student;
import com.xxxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController01 {
    @Resource
    private UserService userService;
    @RequestMapping("student/{sno}")
    public Student queryStudentBySno(@PathVariable Integer sno){
        return userService.queryStudentBySno(sno);
    }
}
