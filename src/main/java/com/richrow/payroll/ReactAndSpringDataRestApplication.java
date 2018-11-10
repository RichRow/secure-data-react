package com.richrow.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ReactAndSpringDataRestApplication extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(ReactAndSpringDataRestApplication.class, args);
    }
}
