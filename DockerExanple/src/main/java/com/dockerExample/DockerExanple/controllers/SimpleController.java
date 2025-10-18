package com.dockerExample.DockerExanple.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/hi")
    public String sayHello() {
        return "Hello World!";
    }
}
