package com.example.day14ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.model.Book;
import com.example.day14ce2.repository.BookRepo;

@Service
public class BookService {
   @Autowired
   BookRepo bookRepo;

   public Book addBook(Book book)
   {
        return bookRepo.save(book);
   }

   public List<Book> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<Book> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public Book updateBook(int id,Book book)
   {
        Book avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
