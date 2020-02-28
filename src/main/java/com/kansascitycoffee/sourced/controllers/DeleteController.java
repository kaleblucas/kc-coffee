package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.CafeRepository;
import com.kansascitycoffee.sourced.models.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("delete")
public class DeleteController {

    @Autowired
    private CafeRepository cafeRepository;

    @GetMapping()
    public String displayDeleteCafeForm(Model model){
        model.addAttribute("cafes", cafeRepository.findAll() );
        return "delete";
    }

    @PostMapping()
    public String processDeleteCafeForm(@RequestParam int[] cafeIds){
        if (cafeIds != null) {
            for (int id : cafeIds) {
                cafeRepository.deleteById(id);
            }
        }

        return "redirect:";
    }
}
