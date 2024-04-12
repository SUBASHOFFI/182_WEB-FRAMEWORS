package com.example.class_exercise_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_1.model.Medicine;

/**
 * MedicineRepository
 */
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

}
