package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.Person;
import com.examly.class_exercise_1.service.PersonService;

@RestController
public class PersonController {

     @Autowired
     public PersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<Person> postMethodName(@RequestBody Person entity) {

          Person inst = personService.SaveEntity(entity);

          return new ResponseEntity<Person>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<Person>> getMethodName() {

          List<Person> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Person>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Person>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<Person> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}