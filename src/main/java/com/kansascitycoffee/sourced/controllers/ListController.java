package com.kansascitycoffee.sourced.controllers;

import com.kansascitycoffee.sourced.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;


@Controller
@RequestMapping(value = "list")
public class ListController {

    public ListController () {

    }

    @RequestMapping(value = "")
    public String list(Model model) {
        ArrayList<Cafe> cafes;
        cafes = CafeData.findAll();
        model.addAttribute("cafes", cafes);
        return "list";
    }

//    @RequestMapping(value = "companies")
//    public String listCompaniesByColumnAndValue(Model model, @RequestParam String column, @RequestParam String value) {
//        ArrayList<Company> companies;
//        if (column.toLowerCase().equals("all")){
//            companies = CompanyData.findAll();
//            model.addAttribute("title", "All Companies");
//        } else {
//            companies = CompanyData.findByColumnAndValue(column, value);
//            model.addAttribute("title", "Companies with " + columnChoices.get(column) + ": " + value);
//        }
//        model.addAttribute("companies", companies);
//
//        return "list-companies";
//    }
}