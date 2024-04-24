package com.example.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.Student;
import com.example.class_exercise_2.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class StudentController {

     @Autowired
     public StudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<Student>> getDetails() {
          List<Student> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<Student>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Student>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<Student> postMethodName(@RequestBody Student student) {

          Student postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<Student>> sortedDetails(@PathVariable String field) {
          List<Student> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<Student>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Student>>(list, HttpStatus.OK);

     }
}
