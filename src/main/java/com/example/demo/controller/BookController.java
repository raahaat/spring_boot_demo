package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AthorRepo;
import com.example.demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    AthorRepo authorRepo;
    @Autowired
    BookRepo bookRepo;

    @PostMapping("/author")
    public Author addAuthor(@RequestBody Author author){
        authorRepo.save(author);
        return author;
    }
    @GetMapping("/author")
    public List<Author> getAuthors(){
        return authorRepo.findAll();
    }

    @PostMapping("/book")
    public Book addBook( @RequestBody Book book){
        bookRepo.save(book);
        return book;
    }

}
