package com.example.demo.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public class Services {

    public void sparerUdregner(@RequestParam short alder, @RequestParam int dage, Model model1){
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
    }
}
