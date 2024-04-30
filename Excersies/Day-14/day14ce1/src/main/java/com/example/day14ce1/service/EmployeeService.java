package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.Employee;
import com.example.day14ce1.repository.EmployeeRepo;

@Service

public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<Employee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
