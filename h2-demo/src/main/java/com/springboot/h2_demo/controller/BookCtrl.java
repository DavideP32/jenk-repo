package com.springboot.h2_demo.controller;

import com.springboot.h2_demo.model.Book;
import com.springboot.h2_demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookCtrl {

    @Autowired
    BookRepo bookRepo;

    @GetMapping
    public ResponseEntity<?> getAllBooks(){
//        bookRepo.save(new Book(null, "ciao", 222, "miao" ));
        List<Book> all = bookRepo.findAll();
        return ResponseEntity.ok(all);
    }

    @PostMapping
    public ResponseEntity<?> postBook(@RequestBody Book book){
        Book save = bookRepo.save(book);
        return ResponseEntity.ok(save);
    }
}
