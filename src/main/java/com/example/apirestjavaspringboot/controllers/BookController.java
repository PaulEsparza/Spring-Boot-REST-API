package com.example.apirestjavaspringboot.controllers;

import java.util.ArrayList;

import com.example.apirestjavaspringboot.models.BookModel;
import com.example.apirestjavaspringboot.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    BookService bookService;

    @GetMapping()
    public ArrayList<BookModel> getBooks(){
        return this.bookService.getBooks();
    }

    @PostMapping
    public BookModel saveBook(@RequestBody BookModel book){
        return this.bookService.createBook(book);
    }
}