package com.example.proyecto.Repositories;

import com.example.proyecto.Models.user;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class UserRepository {
    private final List<user> usuarios = new ArrayList<>();
    public void guardarUsuario(user usuario) {usuarios.add(usuario);}
    public List<user> getUsuarios() {return usuarios;}


}
