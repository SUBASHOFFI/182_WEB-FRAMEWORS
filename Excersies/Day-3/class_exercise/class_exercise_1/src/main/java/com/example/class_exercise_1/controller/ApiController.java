package com.example.class_exercise_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_1.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ApiController {

    List<Employee> list = new ArrayList<>();

    @GetMapping("/")
    public List<Employee> getMethod() {
        return list;
    }

    @GetMapping("/{id}")

    public Employee MethodName(@PathVariable int id) {
        for (Employee e : list) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @PostMapping("/add")
    public boolean getName(@RequestBody Employee e) {
        list.add(e);
        return true;
    }

    @PutMapping("/update/{id}")
    public boolean putMethodName(@PathVariable int id, @RequestBody Employee e) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i).getId() == id) {
                list.set(i, e);
                return true;
            }
        }
        return false;
    }

    @DeleteMapping("/{id}")
    public boolean DeleteEmployee(@PathVariable int id) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

}
