package com.charan.SpringSecEx.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String greet(HttpServletRequest request ){
        return "welcome to my page " + request.getSession().getId();
    }

}
