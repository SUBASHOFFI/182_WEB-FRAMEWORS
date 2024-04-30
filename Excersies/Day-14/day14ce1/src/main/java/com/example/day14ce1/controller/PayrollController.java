package com.example.day14ce1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.Payroll;
import com.example.day14ce1.service.PayrollService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PayrollController {
    @Autowired
    PayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public Payroll addPayroll(@PathVariable Long employeeId,@RequestBody Payroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<Payroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
