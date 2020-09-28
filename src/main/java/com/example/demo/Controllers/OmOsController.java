package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OmOsController {

    @GetMapping("/omos")
    public String omOsFront(){
        return "home/om-os/om-os-front";
    }
}
