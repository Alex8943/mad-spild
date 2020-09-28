package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
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
    @PostMapping("/spare")
    public String familie(@RequestParam short familiemedlemmer, Model model){
        int familiebeløb = familiemedlemmer * 1800;
        model.addAttribute("familiebel", "En gennemsnitlig familie på " + familiemedlemmer + " spilder mad for: " + familiebeløb + " kr. årligt");
        return "home/spare/spare";
    }
    @PostMapping("/spare1")
    public String alder(@RequestParam short alder, @RequestParam int dage, Model model1){
        int alderbeløb = 0;
        boolean videre = true;
        if(alder >= 16 && alder < 25){
            alderbeløb = 29;
        } else if(alder >= 25 && alder < 35){
            alderbeløb = 33;
        } else if(alder >= 35 && alder < 45){
            alderbeløb = 28;
        } else if(alder >= 45 && alder < 55){
            alderbeløb = 29;
        } else if(alder >= 55 && alder < 65){
            alderbeløb = 37;
        } else if(alder > 65){
            alderbeløb = 27;
        } else{
            videre = false;
        }
        if(videre) {
            alderbeløb = alderbeløb * dage;
            model1.addAttribute("alderbel", "En person på " + alder + " år spilder i løbet af " + dage + " dage i gennemsnit mad for " + alderbeløb + " kr.");
        } else if(!videre){
            model1.addAttribute("alderbel", "Informationer for denne aldersgruppe er ikke tilgængelig.");
        }
        return "home/spare/spare-alder";
    }
}
