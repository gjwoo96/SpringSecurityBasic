package org.example.spring_security_udemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping(value = "/myBalance")
    public String getBalanceDetails(){
        return "Here are the balance details form the DB";
    }

}
