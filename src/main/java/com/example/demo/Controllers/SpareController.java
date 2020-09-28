package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpareController {

    @GetMapping("/spare")
    public String spareFront(){
        return "home/spare/spare-front";
    }
}
