package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("index")
    public String toLogin(){
        System.out.println("toLogin");
        return "login";
    }

}
