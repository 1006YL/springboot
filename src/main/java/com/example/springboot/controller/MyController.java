package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class MyController {
    @RequestMapping("/verify")
    public String controller1(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session)
    {

        if(!username.isEmpty()&&password.equals("123456"))
        {
            session.setAttribute("username",username);
            return "redirect:/main.html";
        }
        else
        {
            model.addAttribute("msg","用户名或者密码错误");
            return "login";
        }
    }
}
