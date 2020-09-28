package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaktaController {

    @GetMapping("/fakta")
    public String faktaFront(){
        return "home/fakta/fakta-front";
    }
}
