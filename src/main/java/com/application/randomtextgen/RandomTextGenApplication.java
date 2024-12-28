package com.application.randomtextgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.application")
@EnableMongoRepositories(basePackages = "com.application.Repository")
public class RandomTextGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(RandomTextGenApplication.class, args);
    }

}