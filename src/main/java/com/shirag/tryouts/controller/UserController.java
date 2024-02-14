package com.shirag.tryouts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/tryout")
@AllArgsConstructor
public final class UserController {


    @GetMapping("/hello")
    public String hello() {
        return  "Hello world from SpringBoot app!!" ;
    }
}
