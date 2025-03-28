package com.example.proyecto.Models;

public class medic {
    private String name;
    private String username;
    private String password;
    private String especiality;
    private int cost;
    private String location;

    public medic(String name, String username, String password, String especiality, int cost, String location) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.especiality = especiality;
        this.cost = cost;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
