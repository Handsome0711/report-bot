package com.example.reportbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class ReportBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportBotApplication.class, args);
    }

}
