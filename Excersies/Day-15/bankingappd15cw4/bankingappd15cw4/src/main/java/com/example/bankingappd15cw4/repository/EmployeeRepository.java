// EmployeeRepository.java
package com.example.bankingappd15cw4.repository;

import com.example.bankingappd15cw4.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
