package com.example.apirestjavaspringboot.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.apirestjavaspringboot.models.BookModel;
import com.example.apirestjavaspringboot.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.OPTIONS,RequestMethod.PATCH,RequestMethod.DELETE})
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping()
    public ArrayList<BookModel> getBooks() {
        return this.bookService.getBooks();
    }

    @GetMapping(path = "/{id}")
    public Optional<BookModel> getBooks(@PathVariable("id") Integer id) {
        return this.bookService.getBookId(id);
    }

    @PostMapping
    public BookModel saveBook(@RequestBody BookModel book){
        return this.bookService.createBook(book);
    }

    @PutMapping
    public BookModel updateBook(@RequestBody BookModel book){
        return this.bookService.updateBook(book);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteBook(@PathVariable("id") Integer id) {
        return this.bookService.deleteBook(id);
        /*
        boolean ok = this.bookService.deleteBook(id);
        if (ok) {
            return "Se elimino el libro con id: " + id;
        } else {
            return "No se pudo eliminar el libro con id: " + id;
        }
        */
    }
}