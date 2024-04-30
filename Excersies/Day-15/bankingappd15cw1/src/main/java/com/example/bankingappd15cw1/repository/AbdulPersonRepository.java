// PersonRepository.java
package com.example.bankingappd15cw1.repository;

import com.example.bankingappd15cw1.model.AbdulPerson;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AbdulPersonRepository {

    // Implement CRUD operations for Person entity

    public AbdulPerson save(AbdulPerson person) {
        // Save the person entity in the database
        return person;
    }

    public List<AbdulPerson> findAll() {
        // Retrieve all persons from the database
        return null;
    }

    public AbdulPerson findById(int id) {
        // Retrieve a person by id from the database
        return null;
    }

    public void delete(int id) {
        // Delete a person by id from the database
    }
}
