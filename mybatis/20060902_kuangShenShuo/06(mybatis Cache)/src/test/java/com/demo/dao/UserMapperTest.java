package com.demo.dao;

import com.demo.pojo.User;
import com.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        sqlSession.close();
    }
    @Test
    public void testGetUserById01(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userById1 = userMapper.getUserById(1);
        for (User user : userById1) {
            System.out.println(user);
        }
        List<User> userById2 = userMapper.getUserById(1);
        for (User user : userById2) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testGetUserById02(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userById1 = userMapper.getUserById(1);
        for (User user : userById1) {
            System.out.println(user);
        }
        sqlSession.close();
        SqlSession sqlSession1 = MybatisUtil.getSqlSession();
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        List<User> userById2 = userMapper1.getUserById(1);
        for (User user : userById2) {
            System.out.println(user);
        }
        sqlSession1.close();
    }
}
