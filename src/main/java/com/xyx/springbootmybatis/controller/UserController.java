package com.xyx.springbootmybatis.controller;


import com.xyx.springbootmybatis.pojo.User;
import com.xyx.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查
    @GetMapping("/selectUser")
    public String selectUser(Model model){
        List<User> list = this.userService.queryUser();
        model.addAttribute("list", list);
        return "query";
    }

    //增
    @PostMapping("/addUser")
    public String addUser(User user){
        int id = this.userService.addUser(user);
        System.out.println("插入成功，ID: "+id);
        return "success";
    }
}
