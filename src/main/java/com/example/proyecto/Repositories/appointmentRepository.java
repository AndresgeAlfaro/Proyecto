package com.example.proyecto.Repositories;

import com.example.proyecto.Models.appointment;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class appointmentRepository {
    private final List<appointment> appointments = new ArrayList<>();
    public void guardarCita(appointment appointment) {appointments.add(appointment);}
    public List<appointment> getCitas() {return appointments;}
}