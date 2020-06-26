package com.demo.dao;

import com.demo.pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books getBookById(int id);
    //查询全部的书
    List<Books> getAllBooks();
}
