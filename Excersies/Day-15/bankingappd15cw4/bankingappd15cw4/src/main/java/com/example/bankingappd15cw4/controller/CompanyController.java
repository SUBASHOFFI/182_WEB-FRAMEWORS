// CompanyController.java
package com.example.bankingappd15cw4.controller;

import com.example.bankingappd15cw4.model.Company;
import com.example.bankingappd15cw4.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        Company createdCompany = companyService.createCompany(company);
        return new ResponseEntity<>(createdCompany, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies() {
        List<Company> companies = companyService.getAllCompanies();
        return new ResponseEntity<>(companies, HttpStatus.OK);
    }

    @GetMapping("/{companyId}")
    public ResponseEntity<Company> getCompanyById(@PathVariable int companyId) {
        Optional<Company> company = companyService.getCompanyById(companyId);
        return company.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{companyId}")
    public ResponseEntity<Company> updateCompany(@PathVariable int companyId, @RequestBody Company updatedCompany) {
        Company company = companyService.updateCompany(companyId, updatedCompany);
        return company != null ? new ResponseEntity<>(company, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{companyId}")
    public ResponseEntity<Void> deleteCompanyById(@PathVariable int companyId) {
        companyService.deleteCompanyById(companyId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
