package com.example.proyecto.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adminListedMedicsController {
    @GetMapping("/User/adminListedMedics")
    public String adminListedMedics() { return "adminListedMedics"; }
}