package com.example.class_exercise_3.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
     
     @RequestMapping("/favouriteColor")
     public String requestMethodName(@RequestParam String color) {
         return "My favorite color is " + color + "!";
     }
     
}
