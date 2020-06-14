package com.demo.dao;

import com.demo.pojo.User;
import com.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        sqlSession.close();
    }

    @Test
    public void testGetUsers(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.getUsers();
        for (User u:users) {
            System.out.println(u);
        }
        sqlSession.close();
    }
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User u = userDao.getUserById(7, "asdf");
        System.out.println(u);
        sqlSession.close();
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id","7");
        map.put("pwd","123456");
        map.put("name","asdf");
        for(String k:map.keySet()){
            System.out.println(k+":"+map.get(k));
        };
        int i = userDao.insertUser(map);
        if(i==1){
            System.out.println("插入成功！");
        }else {
            System.out.println("插入失败！");
        }
        sqlSession.close();
    }

    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int i = userDao.deleUser(7);
        if(i==1){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
        sqlSession.close();
    }
}
