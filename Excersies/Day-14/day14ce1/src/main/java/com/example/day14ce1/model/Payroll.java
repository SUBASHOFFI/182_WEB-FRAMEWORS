package com.example.day14ce1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payroll")
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long payrollId;
    double amount;
    int noOfDaysWorked;
    public Long getPayrollId() {
        return payrollId;
    }
    public void setPayrollId(Long payrollId) {
        this.payrollId = payrollId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getNoOfDaysWorked() {
        return noOfDaysWorked;
    }
    public void setNoOfDaysWorked(int noOfDaysWorked) {
        this.noOfDaysWorked = noOfDaysWorked;
    }

    
    
}
