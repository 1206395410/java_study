package com.demo.testProxy;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("新增了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查找了一个用户");
    }
}
