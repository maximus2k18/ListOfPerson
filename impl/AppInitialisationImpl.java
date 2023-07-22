package org.example.impl;

import org.example.entity.Person;
import org.example.enums.Gender;
import org.example.interfaces.AppInitialisation;
import org.example.interfaces.PersonRepository;

public class AppInitialisationImpl implements AppInitialisation {
    private static Long id=1L;

    @Override
    public void initialize(PersonRepository repositoryPerson) {
        Person person1 = new Person(id, "Максим", "Муравьёв",  "Сергеевич","03.02.2002", Gender.MAN);
        repositoryPerson.save(id,person1);

        Person person2 = new Person(++id, "Вася", "Пупкин", "Сергеевич" ,"08.02.2008",Gender.MAN);
        repositoryPerson.save(id,person2);

        Person person3 = new Person(++id, "Мария", "Смирнова", "Сергеевна","06.05.1996",Gender.WOMAN);
        repositoryPerson.save(id,person3);

        Person person4 = new Person(++id, "Вася", "Пугачев", "Алексеевич" ,"17.11.2011",Gender.MAN);
        repositoryPerson.save(id,person4);
    }

    @Override
    public Person createPerson(String name, String lastName, String patronymicName, String dateOfBirth, Gender gender) {
        id++;
        return new Person(id,name,lastName,patronymicName,dateOfBirth,gender);
    }
}
