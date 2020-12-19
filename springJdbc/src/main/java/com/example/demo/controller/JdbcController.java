package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController

public class JdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/userlist")
    public List<Map<String, Object>> userList() {
        String sql = "select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    @GetMapping("/addlist")
    public String addList() {
        String sql = "insert into user(id,name,pwd) value(1,'小明','1345')";
        jdbcTemplate.update(sql);
//        jdbcTemplate.update(sql,Object);
        return "ok";
    }
}
