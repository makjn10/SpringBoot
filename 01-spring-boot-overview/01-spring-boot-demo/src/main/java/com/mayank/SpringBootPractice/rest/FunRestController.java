package com.mayank.SpringBootPractice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose '/' endpoint that will return 'Hello World!'
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
