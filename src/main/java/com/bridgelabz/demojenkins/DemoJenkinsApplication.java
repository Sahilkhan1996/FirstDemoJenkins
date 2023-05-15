package com.bridgelabz.demojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

    public static  main(String[] args) {
        SpringApplication.run(DemoJenkinsApplication.class, args);
        System.out.println("Second commit");
    }

}
