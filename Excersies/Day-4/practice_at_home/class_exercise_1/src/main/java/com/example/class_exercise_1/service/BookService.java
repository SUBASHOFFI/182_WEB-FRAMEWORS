package com.example.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.Book;
import com.example.class_exercise_1.repo.BookRepo;

@Service
public class BookService {

     @Autowired
     private BookRepo bookRepo;

     public Book SaveEntity(Book entity) {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'SaveEntity'");
     }

     public List<Book> getDetails() {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'getDetails'");
     }

     public Book getBookById(int bookId) {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'getBookById'");
     }

}
