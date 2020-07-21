package com.example.apirestjavaspringboot.repositories;

//import java.util.ArrayList;
//import java.util.Optional;

import com.example.apirestjavaspringboot.models.BookModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookModel, Integer> {

    
}