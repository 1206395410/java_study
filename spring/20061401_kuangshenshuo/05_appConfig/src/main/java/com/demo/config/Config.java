package com.demo.config;

import com.demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean的id.
    @Bean
    public User user(){
        return new User();
    }
}
