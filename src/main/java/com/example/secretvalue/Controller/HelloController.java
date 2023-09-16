package com.example.secretvalue.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @Value("${sayhello}")
    String secretValue;

    @GetMapping
    public String hello() {
        return secretValue;
    }
}
