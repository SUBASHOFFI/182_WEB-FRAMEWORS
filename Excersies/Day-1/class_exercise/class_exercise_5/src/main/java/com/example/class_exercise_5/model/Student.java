package com.example.class_exercise_5.model;

public class Student {
     private String StudentName;
     private String StudentID;
     public Student(String studentName, String studentID) {
          StudentName = studentName;
          StudentID = studentID;
     }
     public String getStudentName() {
          return StudentName;
     }
     public void setStudentName(String studentName) {
          StudentName = studentName;
     }
     public String getStudentID() {
          return StudentID;
     }
     public void setStudentID(String studentID) {
          StudentID = studentID;
     }
}
