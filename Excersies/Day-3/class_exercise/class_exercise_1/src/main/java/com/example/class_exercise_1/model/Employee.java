package com.example.class_exercise_1.model;

public class Employee {
     private int id;
     private String employeeName;
     private int employeeAge;
     private long salary;
     public Employee(int id, String employeeName, int employeeAge, long salary) {
          this.id = id;
          this.employeeName = employeeName;
          this.employeeAge = employeeAge;
          this.salary = salary;
     }
     public int getId() {
          return id;
     }
     public void setId(int id) {
          this.id = id;
     }
     public String getEmployeeName() {
          return employeeName;
     }
     public void setEmployeeName(String employeeName) {
          this.employeeName = employeeName;
     }
     public int getEmployeeAge() {
          return employeeAge;
     }
     public void setEmployeeAge(int employeeAge) {
          this.employeeAge = employeeAge;
     }
     public long getSalary() {
          return salary;
     }
     public void setSalary(long salary) {
          this.salary = salary;
     }
}
