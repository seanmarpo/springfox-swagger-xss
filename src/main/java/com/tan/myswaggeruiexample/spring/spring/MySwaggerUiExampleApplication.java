package com.tan.myswaggeruiexample.spring.spring;

import com.tan.myswaggeruiexample.spring.config.CommonConfig;
import com.tan.myswaggeruiexample.spring.config.SwaggerConfig;
import com.tan.myswaggeruiexample.spring.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {CommonConfig.class, WebConfig.class, SwaggerConfig.class})
public class MySwaggerUiExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(MySwaggerUiExampleApplication.class, args);
  }

}
