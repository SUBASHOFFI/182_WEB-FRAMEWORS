package com.example.class_exercise_4.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;

import com.example.class_exercise_4.model.Book;


@RestController
public class BookController {
     
@GetMapping("/path")
public Book getMethodName() {
   Book b = new Book("The Great Soldier", "G.Gyan", new Date());
   return b;
}

     
}
