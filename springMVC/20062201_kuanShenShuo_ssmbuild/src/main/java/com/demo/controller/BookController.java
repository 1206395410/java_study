package com.demo.controller;

import com.demo.pojo.Books;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部数据，返回到书籍展示页面
    @RequestMapping("/getBooks")
    public String list(Model model){
        List<Books> allBooks = bookService.getAllBooks();
        model.addAttribute("Books",allBooks);
        return "allBooks";
    }
    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }
    //新增书籍
    @RequestMapping("/addBook")
    public String addBook(Books book){
        book.setBookID(2342343);
        bookService.addBook(book);
        return "redirect:/book/getBooks";
    }
    //删除书籍
    @RequestMapping("/deleBook")
    public String deleBook(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/getBooks";
    }
}
