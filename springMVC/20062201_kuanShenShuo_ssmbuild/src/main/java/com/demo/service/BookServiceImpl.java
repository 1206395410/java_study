package com.demo.service;

import com.demo.dao.BookMapper;
import com.demo.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BookServiceImpl implements BookService {
    //service调dao层
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books getBookById(int id) {
        return bookMapper.getBookById(id);
    }

    public List<Books> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
