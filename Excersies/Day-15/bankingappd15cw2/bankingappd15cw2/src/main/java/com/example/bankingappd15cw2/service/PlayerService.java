// PlayerService.java
package com.example.bankingappd15cw2.service;

import com.example.bankingappd15cw2.model.Player;
import com.example.bankingappd15cw2.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public Player createPlayer(Player player) {
        return playerRepo.save(player);
    }

    public List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }

    public Player getPlayerById(int id) {
        return playerRepo.findById(id);
    }

    public void deletePlayerById(int id) {
        playerRepo.deleteById(id);
    }
}
