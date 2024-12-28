package com.example.randomtextgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableMongoRepositories(basePackages = "com.example.Repository")
//@ComponentScan(basePackages = "com.example")
public class RandomTextGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomTextGenApplication.class, args);
    }

}
