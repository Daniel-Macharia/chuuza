package com.chirp.chuuza.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/all")
    public String homeController()
    {
        return "<h1>Welcome to Chuuza</h1>";
    }
}
