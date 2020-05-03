package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.CafeRepository;
import com.kansascitycoffee.sourced.data.CoffeeRepository;
import com.kansascitycoffee.sourced.data.FarmRepository;
import com.kansascitycoffee.sourced.models.Cafe;
import com.kansascitycoffee.sourced.models.Coffee;
import com.kansascitycoffee.sourced.models.Farm;
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
    private CoffeeRepository coffeeRepository;
    @Autowired
    private FarmRepository farmRepository;

        @GetMapping("")
    public String displayAddForms(Model model){

            model.addAttribute("cafes", cafeRepository.findAll());
            model.addAttribute("coffees", coffeeRepository.findAll());
            model.addAttribute("farms", farmRepository.findAll());
            model.addAttribute(new Cafe());
            model.addAttribute(new Coffee());
            model.addAttribute(new Farm());

        return "add";
    }

//    @GetMapping("cafe")
//    public String displayAddCafeForm(Model model){
//        model.addAttribute(new Cafe());
//        return "add";
//    }

    @PostMapping("cafe")
    public String processAddCafeForm(@ModelAttribute @Valid Cafe newCafe, Errors errors, Model model){
        cafeRepository.save(newCafe);
        return "redirect:edit";
    }

//    @GetMapping("coffee")
//    public String displayAddCoffeeForm(Model model){
//        model.addAttribute(new Coffee());
//        return "add";
//    }

    @PostMapping("coffee")
    public String processAddCoffeeForm(@ModelAttribute @Valid Coffee newCoffee, Errors errors, Model model, @RequestParam int farmId, @RequestParam int cafeId){
        Optional optCafe = cafeRepository.findById(cafeId);
        if (optCafe.isPresent()) {
            Cafe cafe = (Cafe) optCafe.get();
            newCoffee.setCafe(cafe);
        }

        Optional optFarm = farmRepository.findById(farmId);
        if (optFarm.isPresent()) {
            Farm farm = (Farm) optFarm.get();
            newCoffee.setFarm(farm);
        }
        coffeeRepository.save(newCoffee);
        return "redirect:edit";
    }
//    @GetMapping("farm")
//    public String displayAddFarmForm(Model model){
//        model.addAttribute(new Farm());
//        return "add";
//    }

    @PostMapping("farm")
    public String processAddFarmForm(@ModelAttribute @Valid Farm newFarm,  Errors errors, Model model){
        farmRepository.save(newFarm);
        return "redirect:edit";
    }


}
