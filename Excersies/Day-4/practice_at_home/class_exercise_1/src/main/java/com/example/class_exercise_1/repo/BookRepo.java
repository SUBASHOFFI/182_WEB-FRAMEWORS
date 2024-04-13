package com.example.class_exercise_1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_1.model.Book;

@Repository
/**
 * BookRepo
 */
public interface BookRepo extends JpaRepository<Book, Integer> {

}