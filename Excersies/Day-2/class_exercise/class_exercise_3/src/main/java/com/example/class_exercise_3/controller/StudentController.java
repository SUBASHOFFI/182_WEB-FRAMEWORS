package com.example.class_exercise_3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_3.model.Student;


// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class StudentController {

   @GetMapping("/student")
   public Student getMethodName() {
       Student s = new Student (123, "Nithish");
       return s;
   }
   
     
        // Student s = new Student (123, "Nithish");
    
    
     
     
     
}





