package com.example.class_exercise_1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.Medicine;
import com.example.class_exercise_1.repository.MedicineRepository;

@Service
public class MedicineService {

     @Autowired
     MedicineRepository medicineRepository;

     public List<Medicine> getAllMedicines() {
          // List<Medicine> list ;
          return medicineRepository.findAll();
     }

     public Medicine addMedicine(Medicine medicine) {
          return medicineRepository.save(medicine);
     }

     public Optional<Medicine> getRequiredMedicin(int medicineId) {
          return medicineRepository.findById(medicineId);
     }

}
