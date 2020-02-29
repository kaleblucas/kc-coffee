package com.kansascitycoffee.sourced.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("about")
    public String displayAboutPage(){
        return "about";
    }
}