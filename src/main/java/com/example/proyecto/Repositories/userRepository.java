package com.example.proyecto.Repositories;

import com.example.proyecto.Models.user;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class userRepository {
    private final List<user> users = new ArrayList<>();
    public void guardarUsuario(user usuario) {users.add(usuario);}
    public List<user> getUsuarios() {return users;}
}