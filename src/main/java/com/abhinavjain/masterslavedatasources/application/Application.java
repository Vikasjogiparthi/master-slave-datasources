package com.abhinavjain.masterslavedatasources.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.abhinavjain.masterslavedatasources"})
@EntityScan(basePackages = {"com.abhinavjain.masterslavedatasources"})
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(com.abhinavjain.masterslavedatasources.application.Application.class, args);
    }
}
