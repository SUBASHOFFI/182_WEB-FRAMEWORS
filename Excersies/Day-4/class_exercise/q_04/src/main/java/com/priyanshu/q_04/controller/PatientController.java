package com.priyanshu.q_04.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.priyanshu.q_04.model.Patient;
import com.priyanshu.q_04.service.PatientService;

@RestController
@RequestMapping("api")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patient")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient getAllPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    @GetMapping("/patient")
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> list = patientService.getAllPatients();

        if (list.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<Patient>(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<Patient> getPatientById(@PathVariable int patientId) {
        Optional<Patient> patient = patientService.getPatientById(patientId);

        if (patient.isPresent()) {
            return new ResponseEntity<>(patient.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}