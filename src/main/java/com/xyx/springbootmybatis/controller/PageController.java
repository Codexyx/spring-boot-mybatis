package com.xyx.springbootmybatis.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String toPage(@PathVariable String page){
        return page;
    }

//    @RequestMapping("/toUser")
//    public String toUser(){
//        return "addUser";
//    }
}
