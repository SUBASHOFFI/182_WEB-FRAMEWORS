package com.example.class_exercise_5.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import com.example.class_exercise_5.model.Student;


@RestController
public class StudentController {
     

     @RequestMapping("/student")
     public List<Student> requestMethodName() {
          List<Student> students = new ArrayList<Student>();
          
          students.add(new Student("John","Welcome John!"));
         students.add(new Student("Jane","Welcome Jane!"));

         return students;
     }
     
}
