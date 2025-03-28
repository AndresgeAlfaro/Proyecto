package com.example.proyecto.Models;

public class user {
    private String name;
    private String username;
    private String password;
    private boolean admin = false;

    public user(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
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

    public boolean isAdmin() {
        return admin;
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

    public void enableAdmin() {
        admin = true;
    }
    public void disableAdmin() {
        admin = false;
    }

}
