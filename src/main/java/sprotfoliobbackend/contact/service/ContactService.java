package sprotfoliobbackend.contact.service;

import java.util.List;

import sprotfoliobbackend.contact.model.Contact;

public interface ContactService {
    public Contact saveDetails(Contact contact);
    public List<Contact> getAllEntries();
}
