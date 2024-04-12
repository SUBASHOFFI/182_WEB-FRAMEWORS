package com.priyanshu.q_04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyanshu.q_04.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}