package com.docker.dockerlearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/message")
    public String getMessage(){
        return "hello -world";
    }
}
