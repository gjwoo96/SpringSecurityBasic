package org.example.spring_security_udemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping(value = "/myAccount")
    public String getAccountDetails(){
        return "Here are the account details form the DB";
    }

}
