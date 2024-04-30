// EmployeeService.java
package com.example.bankingappd15cw4.service;

import com.example.bankingappd15cw4.model.Employee;
import com.example.bankingappd15cw4.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }

    public Employee updateEmployee(int employeeId, Employee updatedEmployee) {
        Optional<Employee> existingEmployeeOptional = employeeRepository.findById(employeeId);
        if (existingEmployeeOptional.isPresent()) {
            updatedEmployee.setEmployeeId(employeeId);
            return employeeRepository.save(updatedEmployee);
        }
        return null;
    }

    public void deleteEmployeeById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
