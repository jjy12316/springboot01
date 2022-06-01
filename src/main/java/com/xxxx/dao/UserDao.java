package com.xxxx.dao;

import com.xxxx.po.Student;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public interface UserDao {
    //根据学生编号查询信息
    public Student queryStudentBySno(Integer sno);
}
