package com.priyanshu.q_04.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanshu.q_04.model.Patient;
import com.priyanshu.q_04.repository.PatientRepo;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }

    public Optional<Patient> getPatientById(int id) {
        return patientRepo.findById(id);
    }

    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }

}