package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
        public class UserControl {
            //    解决json乱码的原生方式
//    @RequestMapping(value = "user/t01" produces="application/json;charset=utf-8")
            @RequestMapping("user/t01")
            @ResponseBody
            public String test01() throws JsonProcessingException {
                User user = new User("wjj", 18, "男");
                System.out.println(user.toString());
                ObjectMapper objectMapper = new ObjectMapper();
                String str = objectMapper.writeValueAsString(user);
                System.out.println(str);
        return user.toString()+":"+str;
    }
    @RequestMapping("user/t02")
    @ResponseBody
    public String test02() throws JsonProcessingException {
        User user = new User("wjj", 19, "男");
        //java对象转json字符串
        String s = JSON.toJSONString(user);
        System.out.println(s);
        //json字符串转java对象
        User user1 = JSON.parseObject(s, User.class);
        System.out.println(user1.toString());
        return s;
    }
}
