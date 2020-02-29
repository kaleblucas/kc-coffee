package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.CafeRepository;
import com.kansascitycoffee.sourced.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;


@Controller
@RequestMapping(value = "browse")
public class BrowseController {

    @Autowired
    private CafeRepository cafeRepository;

    @RequestMapping(value = "")
    public String list(Model model, @RequestParam(value = "cafeId", required = false) Integer cafeId) {
        model.addAttribute("cafes",cafeRepository.findAll());
        if(cafeId != null){
            cafeRepository.findById(cafeId).ifPresent(cafe -> model.addAttribute("cafe", cafe));
        }
//        ArrayList<Cafe> cafes;
//        cafes = CafeData.findAll();
//        model.addAttribute("cafes", cafes);
        return "browse";
    }
//    @RequestMapping(value = "")
//    public String cafes(Model model, @RequestParam int cafeId){
//        cafeRepository.findById(cafeId).ifPresent(cafe -> model.addAttribute("cafe", cafe));
////       ArrayList<Cafe> cafes;
////       cafes = CafeData.findAll();
////       for (Cafe cafe : cafes){
////           if (cafe.getId() == selection) {
////               model.addAttribute("cafe", cafe);
////           }
////       }
//       return "browse";
//    }
}