package com.example.mongodbexample.repository;

import com.example.mongodbexample.domain.Book;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
