package org.example.spring_security_udemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping(value = "/notices")
    public String saveContactInquiryDetails(){
        return "Here are the notices details form the DB";

    }

}
