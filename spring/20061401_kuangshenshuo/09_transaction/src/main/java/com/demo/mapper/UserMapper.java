package com.demo.mapper;

import com.demo.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getUsers();
    public int addUser(User user);
    public int deleteUser(int id);
}
