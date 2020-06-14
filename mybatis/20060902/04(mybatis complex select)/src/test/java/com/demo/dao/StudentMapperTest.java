package com.demo.dao;

import com.demo.pojo.Student;
import com.demo.pojo.Teacher;
import com.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class StudentMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        sqlSession.close();
    }

    @Test
    public void testGetStudents(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.getStudents();
        for(Student s:students){
            System.out.println(s);
        }
        sqlSession.close();
    }

}