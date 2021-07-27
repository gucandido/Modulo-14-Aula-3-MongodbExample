package com.example.mongodbexample.service;

import com.example.mongodbexample.domain.Book;
import com.example.mongodbexample.repository.BookRepository;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBooks(Book book) {
        return bookRepository.insert(book);
    }
    public Book updateBooks(Book book) {
        return bookRepository.save(book);
    }
    public boolean deleteBooks(String id) {
        try{
            bookRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }

    }
}
