package com.demo.testProxy;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userService = new UserServiceProxy();
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userService.setUserServiceImpl(userServiceImpl);
        userService.add();
    }
}
