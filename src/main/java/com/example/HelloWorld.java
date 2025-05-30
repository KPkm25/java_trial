package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloWorld {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Java App!";
    }
}
