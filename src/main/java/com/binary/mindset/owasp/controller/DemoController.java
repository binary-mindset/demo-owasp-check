package com.binary.mindset.owasp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo-owasp/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hi there!");
    }
}