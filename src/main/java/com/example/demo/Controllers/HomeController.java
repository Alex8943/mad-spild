package com.example.demo.Controllers;

import com.example.demo.service.Services;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

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

    @GetMapping("/supermarked")
    public String supermarked(){
        return "home/supermarked/supermarked";
    }

    @PostMapping("/spare")
    public String familie(@RequestParam short familiemedlemmer, Model model){
        int familiebeløb = familiemedlemmer * 1800;
        model.addAttribute("familiebel", "En gennemsnitlig familie på " + familiemedlemmer + " spilder mad for: " + familiebeløb + " kr. årligt.");
        return "home/spare/spare";
    }

    @PostMapping("/spare1")
    public String alder(@RequestParam short alder, @RequestParam int dage, Model model1){
        Services services = new Services();
        services.sparerUdregner(alder,dage,model1);
        return "home/spare/spare-alder";
    }
}
