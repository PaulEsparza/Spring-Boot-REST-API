package com.example.apirestjavaspringboot.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class BookModel {
    private Integer id;
    private String title;
    private String author;
    private Double price;
    private String description;

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}