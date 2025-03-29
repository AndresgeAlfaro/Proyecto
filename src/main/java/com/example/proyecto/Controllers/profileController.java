package com.example.proyecto.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class profileController {
    @GetMapping("/Medic/profile")
    public String profile() { return "profile"; }
}
