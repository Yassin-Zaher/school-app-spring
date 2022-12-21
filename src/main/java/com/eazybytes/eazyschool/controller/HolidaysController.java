package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolidaysController {

    @GetMapping("/holidays")
    public String displayHolidays(Model model){

    }
}
