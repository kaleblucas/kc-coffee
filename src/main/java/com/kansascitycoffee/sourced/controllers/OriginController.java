package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.data.OriginRepository;
import com.kansascitycoffee.sourced.models.Origin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("origin")
public class OriginController {

    @Autowired
    private OriginRepository originRepository;


    @GetMapping("add")
    public String displayOriginAddForm(Model model){
        model.addAttribute(new Origin());
        return "origin/add";
    }


    @PostMapping("add")
    public String processAddOriginForm(@ModelAttribute @Valid Origin newOrigin, Errors errors, Model model) {
        originRepository.save(newOrigin);
        return "redirect:add";
    }
}
