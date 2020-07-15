package com.example.springbootjenkinstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsTestApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsTestApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application started successfully");
    }

    public static void main(String[] args) {
        logger.info("Application main method");
        SpringApplication.run(SpringBootJenkinsTestApplication.class, args);
    }

}
