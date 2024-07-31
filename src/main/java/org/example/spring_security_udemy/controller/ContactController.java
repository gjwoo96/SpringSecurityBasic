package org.example.spring_security_udemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping(value = "/contact")
    public String saveContactInquiryDetails(){
        return "Inquiry details are saved to the DB";

    }

}
