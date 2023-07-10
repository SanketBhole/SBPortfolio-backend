package sprotfoliobbackend.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sprotfoliobbackend.contact.model.Contact;
import sprotfoliobbackend.contact.service.ContactService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/contact")
@CrossOrigin
public class ContactController {
    @Autowired
    private ContactService contactService;
    
    @PostMapping("/add")
    public Contact saveDetails(@RequestBody Contact contact) {
            return contactService.saveDetails(contact);        
    }

    @GetMapping("getAllEntries")
    public List<Contact> getAllEntries(){
        return contactService.getAllEntries();
    }
    
}
