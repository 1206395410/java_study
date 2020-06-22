package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//可以通过使用HttpServletRequest、HttpServletResponse完成重定向和请求转发，但是没必要，springMVC提供了对应的更方便的方法。
@Controller
public class ControllerTest05 {
    @RequestMapping("/m1/t1")
    public String test01(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "hello";
    }
    @RequestMapping("/m1/t2")
    public String test02(Model model){
        model.addAttribute("msg","这是重定向");
        return "redirect:/m1/t3";
    }
    @RequestMapping("/m1/t3")
    public String test03(Model model){
        model.addAttribute("msg","这是请求转发");
        return "/test";
    }
}
