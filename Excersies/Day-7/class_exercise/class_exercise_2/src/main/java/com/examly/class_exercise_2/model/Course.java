package com.examly.class_exercise_2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

     @Id
     private int courseId;
     private String courseName;
     private int creditHours;
     private String instructor;
     private String preRequistes;
     private int maxCapacity;
     private String enrolldStudnts;

     public Course() {

     }

     public Course(int courseId, String courseName, int creditHours, String instructor, String preRequistes,
               int maxCapacity, String enrolldStudnts) {
          this.courseId = courseId;
          this.courseName = courseName;
          this.creditHours = creditHours;
          this.instructor = instructor;
          this.preRequistes = preRequistes;
          this.maxCapacity = maxCapacity;
          this.enrolldStudnts = enrolldStudnts;
     }

     public int getCourseId() {
          return courseId;
     }

     public void setCourseId(int courseId) {
          this.courseId = courseId;
     }

     public String getCourseName() {
          return courseName;
     }

     public void setCourseName(String courseName) {
          this.courseName = courseName;
     }

     public int getCreditHours() {
          return creditHours;
     }

     public void setCreditHours(int creditHours) {
          this.creditHours = creditHours;
     }

     public String getInstructor() {
          return instructor;
     }

     public void setInstructor(String instructor) {
          this.instructor = instructor;
     }

     public String getPreRequistes() {
          return preRequistes;
     }

     public void setPreRequistes(String preRequistes) {
          this.preRequistes = preRequistes;
     }

     public int getMaxCapacity() {
          return maxCapacity;
     }

     public void setMaxCapacity(int maxCapacity) {
          this.maxCapacity = maxCapacity;
     }

     public String getEnrolldStudnts() {
          return enrolldStudnts;
     }

     public void setEnrolldStudnts(String enrolldStudnts) {
          this.enrolldStudnts = enrolldStudnts;
     }

}
