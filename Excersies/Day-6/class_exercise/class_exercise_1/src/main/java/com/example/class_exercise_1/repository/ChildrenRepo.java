package com.example.class_exercise_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.class_exercise_1.model.Children;

public interface ChildrenRepo extends JpaRepository<Children, Integer> {

}