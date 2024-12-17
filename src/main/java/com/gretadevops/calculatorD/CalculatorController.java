package com.gretadevops.calculatorD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// cette annotatin va definir les methodes de cette classe
// comme pouvant analyser l'URL des requetes afin de dispatcher
// vers le traitement approprié
@RestController
public class CalculatorController {


    @Autowired
    private Calculator calculator;

    @RequestMapping ("/sum")
     String sum(@RequestParam ("a") Integer a, @RequestParam ("b") Integer b) {
        return String.valueOf (calculator.sum (a, b));
    }
}
