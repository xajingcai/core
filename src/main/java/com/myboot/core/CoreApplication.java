package com.myboot.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//包含EnableAutoConfiguration注解
@SpringBootApplication
@RestController
@ServletComponentScan(basePackages = "com.myboot.core.web.servlet")
public class CoreApplication {

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }
}
