package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Door;
import java.util.List;

@Repository
public interface DoorRepo extends JpaRepository<Door,Integer>{

    List<Door> findByDoorId(int doorId);
    List<Door> findByAccessType(String accessType);
    
}
