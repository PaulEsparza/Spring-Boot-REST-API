package com.example.apirestjavaspringboot.services;

import java.util.ArrayList;
import java.util.Optional;

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

    public BookModel updateBook(BookModel book){
        return this.bookRepository.save(book);
    }

    public Optional<BookModel> getBookId(Integer id){
        return this.bookRepository.findById(id);
    }

    public boolean deleteBook(Integer id){
        try {
            this.bookRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}