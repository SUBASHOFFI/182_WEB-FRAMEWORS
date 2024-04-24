package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.Children;
import com.example.class_exercise_1.repository.ChildrenRepo;

@Service
public class ChildrenService {

     @Autowired
     public ChildrenRepo childrenRepo;

     public List<Children> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public Children save(Children children) {
          return childrenRepo.save(children);

     }

     public List<Children> sortedPage(int offset, int pagesize, String field) {
          Page<Children> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<Children> pagination(int offset, int pagesize) {
          Page<Children> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
