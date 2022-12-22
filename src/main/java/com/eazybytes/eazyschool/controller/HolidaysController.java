package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HolidaysController {

    @GetMapping("/holidays")
    public String displayHolidays(Model model){
        List<Holiday> federalHHolidays = Arrays.asList(

                new Holiday(" May 31", "Memorial Day", Holiday.Type.FEDERAL),
                new Holiday(" 1st Sept ", "Independence Day", Holiday.Type.FEDERAL),
                new Holiday(" November 11", "Labor Day", Holiday.Type.FEDERAL),
                new Holiday(" December 25", "Christmas Day:", Holiday.Type.FEDERAL)

        );
        List<Holiday> festiValHolidays = Arrays.asList(
                new Holiday(" Jan 1", "New Year's Day", Holiday.Type.FESTIVAL),
                new Holiday(" Jan 15", "Martin Luther King, Jr. Day", Holiday.Type.FESTIVAL),
                new Holiday("  Feb 12", "Lincoln Day", Holiday.Type.FESTIVAL),
                new Holiday(" Feb 3", "Washington Day", Holiday.Type.FESTIVAL));

        model.addAttribute("FEDERAL", federalHHolidays);
        model.addAttribute("FESTIVAL", festiValHolidays);

        return "holidays.html";
    }
}
