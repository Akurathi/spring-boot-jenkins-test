package com.example.springbootjenkinstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsTestApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsTestApplicationTests.class);


    @Test
    void contextLoads() {
        logger.info("test case executing started");
        Assertions.assertEquals(true, true);
        logger.info("test case executing ended");
    }

}
