package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.CafeRepository;
import com.kansascitycoffee.sourced.data.OriginRepository;
import com.kansascitycoffee.sourced.models.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
public class BrowseController {

    @Autowired
    private CafeRepository cafeRepository;

    @Autowired
    private OriginRepository originRepository;

    @RequestMapping(value = "")
    public String list(Model model) {
        model.addAttribute("origins",originRepository.findAll());
        model.addAttribute("cafes",cafeRepository.findAll());
        return "index";
    }

    @RequestMapping("search")
    public String search(Model model, @RequestParam(value = "searchTerm") String searchTerm){
        ArrayList<Cafe> results = new ArrayList<>();
        for (Cafe cafe : cafeRepository.findAll()) {
            if (cafe.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                results.add(cafe);
            }
        }
        model.addAttribute("searchTerm", searchTerm);
        model.addAttribute("cafeResults", results);
        return "search";

    }


    @PostMapping(value = "cafe")
    public String displayCafe(Model model, @RequestParam(value = "cafeId") Integer cafeId) {
            cafeRepository.findById(cafeId).ifPresent(cafe -> model.addAttribute("cafe", cafe));
        return "cafe";
    }

}