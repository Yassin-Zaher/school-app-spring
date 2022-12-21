package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.controller.ContactController;
import com.eazybytes.eazyschool.model.Contact;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ContactService {

    private static Logger logger = Logger.getLogger(ContactService.class.getName());
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        logger.info(contact.toString());
        return isSaved;
    }
}
