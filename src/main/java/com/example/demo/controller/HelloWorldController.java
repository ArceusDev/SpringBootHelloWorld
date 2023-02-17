package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
        @GetMapping("/index")
        public String getIndex() {
            return "Hello World!";
        }
}
