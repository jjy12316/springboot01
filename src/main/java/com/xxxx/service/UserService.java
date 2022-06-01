package com.xxxx.service;

import com.xxxx.dao.UserDao;
import com.xxxx.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public Student queryStudentBySno(Integer sno){
        return userDao.queryStudentBySno(sno);
    }

}
