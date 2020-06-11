package com.demo.dao;

import com.demo.pojo.User;
import com.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);

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
    @Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }
    @Test
    public void testGetUserListByLimit() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("startIndex",2);
        map.put("pageSize",2);
        List<User> userListByLimit = userDao.getUserListByLimit(map);
        for(User u:userListByLimit){
            System.out.println(u);
        }
        sqlSession.close();
    }
}
