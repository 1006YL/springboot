package com.springdate.controller;

import com.springdate.mapper.UserMapper;
import com.springdate.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/select")
    public List<User> selectall(){
        List<User> users=userMapper.getUserList();
        for (User user:users) {
            System.out.println(user);
        }
        return users;
    }
}
