package ru.fintech.tracker.n.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C {
    @GetMapping
    public String home(){
        return "h";
    }
}
