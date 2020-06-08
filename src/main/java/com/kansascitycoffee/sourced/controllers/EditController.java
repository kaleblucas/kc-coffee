package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.CafeRepository;
import com.kansascitycoffee.sourced.data.OriginRepository;
import com.kansascitycoffee.sourced.models.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("edit")
public class EditController {

    @Autowired
    private CafeRepository cafeRepository;
    @Autowired
    private OriginRepository originRepository;

    @GetMapping("")
    public String displayEditMode(Model model){
        model.addAttribute("cafes", cafeRepository.findAll());
        return "edit";
    }

    @PostMapping("cafe")
    public String showEditForm(Model model, @RequestParam Integer cafeId){
        cafeRepository.findById(cafeId).ifPresent(cafe -> model.addAttribute("cafe", cafe));
        model.addAttribute("origins",originRepository.findAll());
        return "edit/cafe";
    }

    @PostMapping("cafe/del")
    public String processDeleteCafeForm(Model model, @RequestParam Integer cafeId, @RequestParam (value = "del", required = false) String del){
        model.addAttribute("cafes",cafeRepository.findAll());
        if (del != null) {
            if (del.equals("yes")) {
                cafeRepository.deleteById(cafeId);
                return "redirect:/edit/";
            }
        }
        if(cafeId != null){
            cafeRepository.findById(cafeId).ifPresent(cafe -> model.addAttribute("cafe", cafe));
        }


        return "edit";
    }

    @PostMapping()
    public String processUpdateCafeForm(@ModelAttribute Cafe cafe){
        cafeRepository.save(cafe);
        return "redirect:/edit";
    }

}
