package com.example.proyecto.Repositories;

import com.example.proyecto.Models.medic;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class medicRepository {
    private final List<medic> medics = new ArrayList<>();
    public void guardarMedico(medic medic) {medics.add(medic);}
    public List<medic> getMedico() {return medics;}
}