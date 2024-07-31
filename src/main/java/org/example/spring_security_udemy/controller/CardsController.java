package org.example.spring_security_udemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping(value = "/myCards")
    public String getLoanDetails(){
        return "Here are the card details form the DB";
    }

}
