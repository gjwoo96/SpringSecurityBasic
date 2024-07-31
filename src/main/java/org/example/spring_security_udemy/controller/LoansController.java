package org.example.spring_security_udemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping(value = "/myLoans")
    public String getLoanDetails(){
        return "Here are the loan details form the DB";
    }

}
