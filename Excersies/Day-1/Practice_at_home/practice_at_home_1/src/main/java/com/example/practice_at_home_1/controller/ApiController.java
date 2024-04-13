package com.example.practice_at_home_1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class ApiController {
     
     @RequestMapping("/hello")
     public String requestMethodName() {
         return "Hello World!";
     }
     
}
