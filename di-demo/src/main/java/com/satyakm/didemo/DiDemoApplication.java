package com.satyakm.didemo;

import com.satyakm.didemo.Controller.DemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        DemoController demoController = (DemoController)ctx.getBean("demoController");
        demoController.print();
    }
}
