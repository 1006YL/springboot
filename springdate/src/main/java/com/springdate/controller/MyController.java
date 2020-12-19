package com.springdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyController {
        @Autowired
        JdbcTemplate jdbcTemplate;
        @RequestMapping("/list")
        public List<Map<String, Object>> userList(){
            String sql = "select * from user";
            List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
            return maps;
        }

        @GetMapping("/add")
        public String addUser(){
            //插入语句，注意时间问题
            String sql = "insert into employee(id,namme.pwd)" +
                    " values (1,'狂神','123456')";
            jdbcTemplate.update(sql);
            //查询
            return "addOk";
        }

        //修改用户信息
        @GetMapping("/update/{id}")
        public String updateUser(@PathVariable("id") int id){
            //插入语句
            String sql = "update user set name=?,pwd=? where id="+id;
            //数据
            Object[] objects = new Object[2];
            objects[0] = "秦疆";
            objects[1] = "24736743";
            jdbcTemplate.update(sql,objects);
            //查询
            return "updateOk";
        }

        //删除用户
        @GetMapping("/delete/{id}")
        public String delUser(@PathVariable("id") int id){
            //插入语句
            String sql = "delete from user where id=?";
            jdbcTemplate.update(sql,id);
            //查询
            return "deleteOk";
        }

    }
