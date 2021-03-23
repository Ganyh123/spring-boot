package com.gyhstudy.springboot.jpa.controller;

import com.gyhstudy.springboot.jpa.entity.Book;
import com.gyhstudy.springboot.jpa.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @date 2021/3/18
 * @description BookController
 */
@Controller
@RequestMapping(value = "/")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping()
    public String bookPage(Model model){
        model.addAttribute("message","Hello SpringBoot");
        List<Book> bookList = bookService.getAll();
        model.addAttribute("bookList",bookList);
        return "book";
    }
}
