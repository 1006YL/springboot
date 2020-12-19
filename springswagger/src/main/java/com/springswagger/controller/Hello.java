package com.springswagger.controller;

import com.springswagger.entities.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.mapstruct.Mapper;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }
    @ApiOperation("USERCHAOZHUO")
    //@ApiParam("")
    @GetMapping("/user")
    public User user()
    {
        return new User();
    }
    @ApiOperation("posttest")
    //@ApiParam("")
    @GetMapping("/post")
    public User post(@ApiParam("用户") User user)
    {
        return  user;
    }
}
