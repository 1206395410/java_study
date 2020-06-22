package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest04 {
    //原来的   ：http://localhost:8080/and?a=1&b=2
    //Restful :http://localhost:8080/and/1/2
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b, Model model){
        model.addAttribute("msg",a+b+"");
        return "test";
    }
}
