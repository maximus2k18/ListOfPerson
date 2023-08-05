package org.example.interfaces;

import org.example.entity.Person;
import org.example.enums.Gender;

public interface AppInitialisation {
    void initialize(PersonRepository repositoryPerson);
}
