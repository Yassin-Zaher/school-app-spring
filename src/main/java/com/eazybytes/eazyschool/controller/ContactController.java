package com.eazybytes.eazyschool.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
public class ContactController {

    private static Logger logger = (Logger) LoggerFactory.getLogger(ContactController.class);

    @GetMapping("/contact")
    public String displayContactPage(){return "contact.html";}

    @PostMapping("/saveMessage")
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
                                    @RequestParam String email, @RequestParam String subject,
                                    @RequestParam String message){

        logger.info("Name: " + name);
        logger.info("Mobile Number: " + mobileNum);
        logger.info("Email Address: " + email);
        logger.info("Subject: " + subject);
        logger.info("Message: " + message);
        return new ModelAndView("redirect:/contact");
    }
}
