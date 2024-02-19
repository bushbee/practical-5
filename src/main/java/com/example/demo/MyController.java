package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/count")
    public ResponseEntity<String> countToN(@RequestParam String number) throws Throwable{
        long n = Long.parseLong(number);

        // count to n
        for (long i = 0; i < n; i++);
        
        String response = "Done counting till " + number;
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}