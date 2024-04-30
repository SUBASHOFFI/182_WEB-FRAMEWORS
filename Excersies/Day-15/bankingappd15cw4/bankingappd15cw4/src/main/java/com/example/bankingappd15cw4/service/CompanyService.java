// CompanyService.java
package com.example.bankingappd15cw4.service;

import com.example.bankingappd15cw4.model.Company;
import com.example.bankingappd15cw4.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Optional<Company> getCompanyById(int companyId) {
        return companyRepository.findById(companyId);
    }

    public Company updateCompany(int companyId, Company updatedCompany) {
        Optional<Company> existingCompanyOptional = companyRepository.findById(companyId);
        if (existingCompanyOptional.isPresent()) {
            updatedCompany.setCompanyId(companyId);
            return companyRepository.save(updatedCompany);
        }
        return null;
    }

    public void deleteCompanyById(int companyId) {
        companyRepository.deleteById(companyId);
    }
}
