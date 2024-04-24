package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.Person;
import com.examly.class_exercise_1.repository.PersonRepo;

@Service
public class PersonService {

     @Autowired
     public PersonRepo personRepo;

     public Person SaveEntity(Person entity) {
          return personRepo.save(entity);

     }

     public List<Person> getDetails() {
          return personRepo.findAll();

     }

     public List<Person> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
