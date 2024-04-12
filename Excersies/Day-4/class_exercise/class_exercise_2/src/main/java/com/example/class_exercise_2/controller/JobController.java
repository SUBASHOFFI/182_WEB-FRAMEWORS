package com.example.class_exercise_2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.Job;
import com.example.class_exercise_2.service.JobService;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class JobController {

     @Autowired
     public JobService jobService;

     @GetMapping("/api/job")
     public ResponseEntity<List<Job>> displayDetails() {
          List<Job> list = jobService.getList();
          if (list.isEmpty()) {
               return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          } else {

               return new ResponseEntity<>(list, HttpStatus.OK);
          }

     }

     @PostMapping("/api/job")
     public Job postMethodName(@RequestBody Job job) {
          return jobService.postJob(job);
     }

     @GetMapping("/api/job/{jobId}")
     public ResponseEntity<Optional<Job>> getMethodName(@PathVariable int jobId) {

          Optional<Job> Id = jobService.getId(jobId);
          if (Id.isPresent()) {
               return new ResponseEntity<>(Id, HttpStatus.OK);
          }
          return new ResponseEntity<Optional<Job>>(Id, HttpStatus.NOT_FOUND);

     }

}