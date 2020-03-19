package com.restapi.https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class GreetController {

    @GetMapping
    public String hello() {
        return "welcome to spring boot application !!";
    }
}
