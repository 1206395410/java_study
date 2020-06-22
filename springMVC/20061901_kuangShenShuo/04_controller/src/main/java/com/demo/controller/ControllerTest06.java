package com.demo.controller;

import com.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ControllerTest06 {
    //localhost:8080/user/t1?name=xxx
    @GetMapping("/t1")
    public String test1(String name, Model model){
        model.addAttribute("msg",name);
        return "test";
    }
    //localhost:8080/user/t2?id=1&name=小王&age=11
    @GetMapping("/t2")
    public String test2(User u,Model model){
        model.addAttribute("msg",u);
        System.out.println(u);
        return "test";
    }
    //乱码问题
    @PostMapping("t3")
    public String test3(String name,Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
}
