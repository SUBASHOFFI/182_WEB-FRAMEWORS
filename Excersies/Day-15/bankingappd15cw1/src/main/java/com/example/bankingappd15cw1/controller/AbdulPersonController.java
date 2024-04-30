// PersonController.java
package com.example.bankingappd15cw1.controller;

import com.example.bankingappd15cw1.model.AbdulPerson;
import com.example.bankingappd15cw1.service.AbdulPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class AbdulPersonController {

    private final AbdulPersonService personService;

    @Autowired
    public AbdulPersonController(AbdulPersonService personService) {
        this.personService = personService;
    }

    // CRUD operations endpoints

    @PostMapping
    public ResponseEntity<AbdulPerson> createPerson(@RequestBody AbdulPerson person) {
        AbdulPerson createdPerson = personService.createPerson(person);
        return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AbdulPerson>> getAllPersons() {
        List<AbdulPerson> persons = personService.getAllPersons();
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AbdulPerson> getPersonById(@PathVariable int id) {
        AbdulPerson person = personService.getPersonById(id);
        if (person != null) {
            return new ResponseEntity<>(person, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable int id) {
        personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
