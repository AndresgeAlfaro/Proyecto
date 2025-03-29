package com.example.proyecto.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appointmentsController {
    @GetMapping("/Medic/appointments")
    public String index() { return "appointments"; }
}
