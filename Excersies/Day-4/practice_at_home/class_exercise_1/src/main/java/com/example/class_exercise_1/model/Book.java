package com.example.class_exercise_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
     @Id
     private int bookId;
     private String bookName;
     private String author;
     private int price;

     public int getBookId() {
          return bookId;
     }

     public void setBookId(int bookId) {
          this.bookId = bookId;
     }

     public String getBookName() {
          return bookName;
     }

     public void setBookName(String bookName) {
          this.bookName = bookName;
     }

     public String getAuthor() {
          return author;
     }

     public void setAuthor(String author) {
          this.author = author;
     }

     public int getPrice() {
          return price;
     }

     public void setPrice(int price) {
          this.price = price;
     }
}
