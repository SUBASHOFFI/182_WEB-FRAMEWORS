package com.example.class_exercise_2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class StudentController {

     @RequestMapping("/student")
     public student requestMethodName() {

          student s = new student("Nithish", 21);
         return s;
     }
     

    
     
}
