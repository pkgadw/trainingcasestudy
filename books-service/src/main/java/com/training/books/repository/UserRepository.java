package com.training.books.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.training.books.document.UserDocument;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, String> {

}
