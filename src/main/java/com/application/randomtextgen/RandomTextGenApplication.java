package com.application.randomtextgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.application")
@EnableMongoRepositories(basePackages = "com.application.Repository")
//@ComponentScan(basePackages = {"com.application"},
//        excludeFilters = {
//            @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {"com.example"})
//        })
public class RandomTextGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(RandomTextGenApplication.class, args);
    }

}