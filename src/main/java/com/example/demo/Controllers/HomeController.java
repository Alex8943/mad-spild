package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String frontPage(){
        return "home/forside/index";
    }

    @GetMapping("/fakta")
    public String faktaFront(){
        return "home/fakta/fakta-front";
    }

    @GetMapping("/omos")
    public String omOsFront(){
        return "home/om-os/om-os-front";
    }

    @GetMapping("/spare")
    public String spareFront(){
        return "home/spare/spare-front";
    }
}
