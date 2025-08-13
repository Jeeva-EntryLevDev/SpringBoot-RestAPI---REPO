package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Hit it with
@RestController
@RequestMapping("/welcome")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello world ";
    }
}
