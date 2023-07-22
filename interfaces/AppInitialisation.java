package org.example.interfaces;

import org.example.entity.Person;
import org.example.enums.Gender;

public interface AppInitialisation {
    void initialize(PersonRepository repositoryPerson);
    Person createPerson(String name, String lastName, String patronymicName,
                        String dateOfBirth, Gender gender);
}
