package sprotfoliobbackend.contact.model;

import jakarta.persistence.GenerationType;

public @interface GenerateValue {

    GenerationType strategy();

}
