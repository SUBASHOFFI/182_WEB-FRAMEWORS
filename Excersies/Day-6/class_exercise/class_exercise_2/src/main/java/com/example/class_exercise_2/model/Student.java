package com.example.class_exercise_2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

     @Id
     private int id;
     private String name;
     private int age;
     private String city;
     private String rollno;

     public int getId() {
          return id;
     }

     public Student() {

     }

     public Student(int id, String name, int age, String city, String rollno) {
          this.id = id;
          this.name = name;
          this.age = age;
          this.city = city;
          this.rollno = rollno;
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

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     public String getRollno() {
          return rollno;
     }

     public void setRollno(String rollno) {
          this.rollno = rollno;
     }

}
