// Player.java
package com.example.bankingappd15cw2.model;

public class Player {
    private int id;
    private String playerName;
    private String team;
    private int age;

    // Constructors
    public Player() {
    }

    public Player(int id, String playerName, String team, int age) {
        this.id = id;
        this.playerName = playerName;
        this.team = team;
        this.age = age;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
