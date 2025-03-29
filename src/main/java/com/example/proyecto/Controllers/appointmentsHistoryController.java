package com.example.proyecto.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appointmentsHistoryController {
    @GetMapping("/User/appointmentsHistory")
    public String appointmentsHistory() { return "appointmentsHistory"; }
}
