package com.miaoshaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/getotp") //说明了这个映射的url
    public String getotp(){
        return "getotp";
    }//和叫什么没关系

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/login")
    public String login(){return "login";}

    @RequestMapping("/create1")
    public String create(){return "createitem";}

    @RequestMapping("/list")
    public String list(){return "listitem";}

    @RequestMapping("/getitem")
    public String getitem(){return "getitem";}
}
