package sprotfoliobbackend.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sprotfoliobbackend.contact.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {    
}
