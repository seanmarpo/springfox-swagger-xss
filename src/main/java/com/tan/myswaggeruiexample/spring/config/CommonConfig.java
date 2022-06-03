package com.tan.myswaggeruiexample.spring.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.tan.myswaggeruiexample")
@EnableMongoRepositories(value = "com.tan.myswaggeruiexample.repository")
@EntityScan(value = "com.tan.myswaggeruiexample.entity")
@EnableWebMvc
public class CommonConfig {
}
