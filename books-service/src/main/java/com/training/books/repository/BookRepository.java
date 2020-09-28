package com.training.books.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.training.books.document.BookDocument;

@Repository
public interface BookRepository extends MongoRepository<BookDocument, String> {

}
