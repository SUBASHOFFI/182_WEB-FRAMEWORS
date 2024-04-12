package com.example.class_exercise_2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.Job;
import com.example.class_exercise_2.repository.JobRepo;

@Service
public class JobService {

     @Autowired
     public JobRepo jobRepo;

     public List<Job> getList() {
          return jobRepo.findAll();
     }

     public Job postJob(Job job) {
          return jobRepo.save(job);
     }

     public Optional<Job> getId(int jobId) {
          return jobRepo.findById(jobId);
     }

}