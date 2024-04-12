package com.example.class_exercise_2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
     @RequestMapping("/welcome")
     public String requestMethodName(@RequestParam String name) {
         return "Welcome to "+name+"!";
     }
     
     
}
