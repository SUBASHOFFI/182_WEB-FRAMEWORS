package com.example.day14ce1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.Employee;
import com.example.day14ce1.service.EmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@Tag(name = "employee controller", description = "emp controller spin")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getMethodName() {
        return employeeService.getEmployees();
    }
    

    @GetMapping("/employee/{employeeId}")
    public Optional<Employee> getMethodName(@PathVariable Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }
    
}
