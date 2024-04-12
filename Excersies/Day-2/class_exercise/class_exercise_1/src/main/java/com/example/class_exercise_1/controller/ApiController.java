package com.example.class_exercise_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_1.config.AppConfig;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ApiController {
     @Autowired
     public AppConfig a;


     @GetMapping("/value")
     public  String getMethodName() {
         return "appName" +a.appName +"appVersion" +a.appVersion ;
     }
     



}
