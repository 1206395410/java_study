package com.demo.dao;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getUserById(@Param("id") int id);
}
