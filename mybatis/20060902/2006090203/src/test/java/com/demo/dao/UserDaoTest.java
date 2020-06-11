package com.demo.dao;

import com.demo.pojo.User;
import com.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        sqlSession.close();
    }

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //测试获取用户列表
        List<User> userList = userDao.getUserList();
        for(User u:userList){
            System.out.println(u);
        }
        //关闭资源
        sqlSession.close();
    }
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User u = new User(6,"小花","123456");
        userDao.insertUser(u);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.updateUser(new User(2,"张四","123456"));
        sqlSession.commit();
        sqlSession.close();
    }
}
