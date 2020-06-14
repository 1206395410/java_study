package com.demo.dao;

import com.demo.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int insertBook(Blog blog);
    //使用if查询
    List<Blog> getBlogIF(Map map);
    //使用choose查询
    List<Blog> getBlogChoose(Map map);
}
