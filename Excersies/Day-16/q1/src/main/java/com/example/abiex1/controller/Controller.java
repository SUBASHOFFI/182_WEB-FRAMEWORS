package com.example.abiex1.controller;

import org.springframework.web.bind.annotation.RestController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Abicontroller {

    @Autowired
   

    @GetMapping("/welcome")
    public String getMethodName() {
        return  "welcome";
    }
    
    
}
