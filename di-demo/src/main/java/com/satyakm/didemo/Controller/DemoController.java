package com.satyakm.didemo.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    private DemoController(){
        System.out.println("DemoController object created.........");
    }
    public void print(){
        System.out.println("Hello World!!!!");
    }
}
