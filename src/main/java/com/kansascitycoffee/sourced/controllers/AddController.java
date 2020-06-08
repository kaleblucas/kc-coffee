package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.CafeRepository;
import com.kansascitycoffee.sourced.data.OriginRepository;
import com.kansascitycoffee.sourced.models.Cafe;
import com.kansascitycoffee.sourced.models.Origin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("add")
public class AddController {

    @Autowired
    private CafeRepository cafeRepository;
    @Autowired
    private OriginRepository originRepository;

    @RequestMapping("")
    public String displayAddForms(Model model){

            model.addAttribute("cafes", cafeRepository.findAll());
            model.addAttribute("origins", originRepository.findAll());
            model.addAttribute(new Cafe());

        return "add";
    }
    @PostMapping("cafe")
    public String processAddCafeForm(@ModelAttribute @Valid Cafe newCafe, Errors errors, Model model, @RequestParam List<Integer> originIds){
        List<Origin> originObjs = (List<Origin>) originRepository.findAllById(originIds);
        newCafe.setOrigins(originObjs);

        cafeRepository.save(newCafe);
        return "redirect:/add?";
    }




}
