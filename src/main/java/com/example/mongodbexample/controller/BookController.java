package com.example.mongodbexample.controller;

import com.example.mongodbexample.domain.Book;
import com.example.mongodbexample.service.BookService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/mongoexample")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/books")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @PostMapping(value = "/books")
    public ResponseEntity<?> postBooks(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.createBooks(book), HttpStatus.CREATED);
    }

    @PutMapping(value = "/books")
    public ResponseEntity<?> updateBooks(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.updateBooks(book),HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/books")
    public ResponseEntity<?> deleteBooks(@RequestBody String id) {
        return new ResponseEntity<>(bookService.deleteBooks(id)?"ok":"error", HttpStatus.CREATED);
    }


}
