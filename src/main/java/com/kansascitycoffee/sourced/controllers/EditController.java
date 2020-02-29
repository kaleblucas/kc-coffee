package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.CafeRepository;
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

    @GetMapping()
    public String displayEditMode(Model model){
        model.addAttribute("cafes", cafeRepository.findAll());
        return "edit";
    }

    @PostMapping("cafe")
    public String processDeleteCafeForm(@RequestParam int[] q){
        if (q != null) {
            for (int id : q) {
                cafeRepository.deleteById(id);
            }
        }

        return "redirect:";
    }

}
