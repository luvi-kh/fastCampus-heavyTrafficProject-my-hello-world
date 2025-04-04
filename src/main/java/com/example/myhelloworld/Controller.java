package com.example.myhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        var delay = Math.random() * 100;
        Thread.sleep(Math.round(delay));    // 0 ~ 99ms delay

        return "hello world!";
    }
}
