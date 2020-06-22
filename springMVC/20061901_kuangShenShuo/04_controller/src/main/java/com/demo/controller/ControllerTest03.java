package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test02")
public class ControllerTest03 {
    @RequestMapping("/t1")
    public String test(){
        return "test";
    }
}
