package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.CafeRepository;
import com.kansascitycoffee.sourced.models.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("add")
public class AddController {

    @Autowired
    private CafeRepository cafeRepository;

    @GetMapping("")
    public String displayAddCafeForm(Model model){
        model.addAttribute(new Cafe());
        return "add";
    }

    @PostMapping()
    public String processAddCafeForm(@ModelAttribute Cafe newCafe){
        cafeRepository.save(newCafe);
        return "redirect:edit";
    }


}
