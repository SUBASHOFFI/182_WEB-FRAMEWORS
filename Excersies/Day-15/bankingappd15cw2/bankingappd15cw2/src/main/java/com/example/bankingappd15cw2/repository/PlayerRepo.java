// PlayerRepo.java
package com.example.bankingappd15cw2.repository;

import com.example.bankingappd15cw2.model.Player;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo {
    Player save(Player player);

    List<Player> findAll();

    Player findById(int id);

    void deleteById(int id);
}
