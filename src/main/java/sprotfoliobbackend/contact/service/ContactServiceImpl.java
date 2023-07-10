package sprotfoliobbackend.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprotfoliobbackend.contact.model.Contact;
import sprotfoliobbackend.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact saveDetails(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllEntries() {
        return contactRepository.findAll();
    }
    
}
