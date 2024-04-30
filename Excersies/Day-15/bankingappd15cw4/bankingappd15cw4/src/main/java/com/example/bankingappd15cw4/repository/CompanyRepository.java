// CompanyRepository.java
package com.example.bankingappd15cw4.repository;

import com.example.bankingappd15cw4.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}

