package com.satyakm.sprngbootjokeapp;

import com.satyakm.sprngbootjokeapp.PropertyTestPkg.TestClass;
import com.satyakm.sprngbootjokeapp.config.PropertyTest;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprngbootjokeappApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SprngbootjokeappApplication.class,args);
        TestClass testClass = (TestClass) context.getBean(TestClass.class);
        System.out.println(testClass);

    }
}
