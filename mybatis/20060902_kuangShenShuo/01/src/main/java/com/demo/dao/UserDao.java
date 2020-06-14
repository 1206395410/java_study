package com.demo.dao;

import com.demo.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();
    User getUserById(int id);
    void insertUser(User user);
    void updateUser(User user);
    List<User> getUserListByLimit(Map<String,Object> map);
}
