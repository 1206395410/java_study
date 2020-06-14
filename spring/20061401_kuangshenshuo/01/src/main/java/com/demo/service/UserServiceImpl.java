package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao=userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
