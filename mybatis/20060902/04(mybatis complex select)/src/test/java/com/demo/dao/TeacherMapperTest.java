package com.demo.dao;

import com.demo.pojo.Teacher;
import com.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class TeacherMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        sqlSession.close();
    }

    @Test
    public void testGetTeachers(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.getTeachers();
        for(Teacher t:teachers){
            System.out.println(t);
        }
        sqlSession.close();
    }

}
