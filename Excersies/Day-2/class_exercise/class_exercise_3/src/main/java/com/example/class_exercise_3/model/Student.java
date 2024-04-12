package com.example.class_exercise_3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
     @JsonIgnore
    private int id;
    private String name;
public Student(int id, String name) {
     this.id = id;
     this.name = name;
}
public int getId() {
     return id;
}
public void setId(int id) {
     this.id = id;
}
public String getName() {
     return name;
}
public void setName(String name) {
     this.name = name;
}
    
     
     
}
