package com.example.class_exercise_2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class student {
     @JsonProperty("Student Name")
     private String name;
     @JsonProperty("Student age")
     private int age;
     public student(String name, int age) {
          this.name = name;
          this.age = age;
     }
     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }
     public int getAge() {
          return age;
     }
     public void setAge(int age) {
          this.age = age;
     }
}
