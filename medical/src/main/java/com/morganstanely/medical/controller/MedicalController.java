package com.morganstanely.medical.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medical")
public class MedicalController {

    @RequestMapping("/hello")
    public String helloController(){
        return "Welcome to Medical App";
    }
}
