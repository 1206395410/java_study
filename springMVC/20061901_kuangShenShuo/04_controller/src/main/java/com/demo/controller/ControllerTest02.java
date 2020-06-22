package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest02 {
    @RequestMapping("/test02")
    public String test02(Model model){
        model.addAttribute("msg","test02");
        return "test";
    }
}
