package com.demo.dao;

import com.demo.pojo.Blog;
import com.demo.utils.IDutils;
import com.demo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BlogMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        sqlSession.close();
    }
    @Test
    public void testInsertBook(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        blogMapper.insertBook(new Blog(IDutils.getId(), "白鹿原", "陈忠实", new Date(), 1));
        blogMapper.insertBook(new Blog(IDutils.getId(),"Mybatis如此简单","狂神说",new Date(),20));
        blogMapper.insertBook(new Blog(IDutils.getId(),"java如此简单","狂神说",new Date(),20));
        blogMapper.insertBook(new Blog(IDutils.getId(),"spring如此简单","狂神说",new Date(),20));
        blogMapper.insertBook(new Blog(IDutils.getId(),"微服务如此简单","狂神说",new Date(),20));
        sqlSession.close();
    }
    @Test
    public void testGetBlogIF(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title","白鹿原");
        List<Blog> blogIF = blogMapper.getBlogIF(map);
        for(Blog b:blogIF){
            System.out.println(b);
        }
        sqlSession.close();
    }
    @Test
    public void testGetBlogChoose(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("views",20);
//        map.put("title","白鹿原");
        map.put("author","陈忠实");
        List<Blog> blogIF = blogMapper.getBlogChoose(map);
        for(Blog b:blogIF){
            System.out.println(b);
        }
        sqlSession.close();
    }
}
