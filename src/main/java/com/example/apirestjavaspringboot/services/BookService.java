package com.example.apirestjavaspringboot.services;

import java.util.ArrayList;

import com.example.apirestjavaspringboot.models.BookModel;
import com.example.apirestjavaspringboot.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    
    public ArrayList<BookModel> getBooks(){
        return (ArrayList<BookModel>) this.bookRepository.findAll();
    }

    public BookModel createBook(BookModel book){
        return this.bookRepository.save(book);
    }


}