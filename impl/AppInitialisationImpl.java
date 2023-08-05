package org.example.impl;

import org.example.entity.Person;
import org.example.enums.Gender;
import org.example.interfaces.AppInitialisation;
import org.example.interfaces.PersonRepository;

public class AppInitialisationImpl implements AppInitialisation {

    @Override
    public void initialize(PersonRepository repositoryPerson) {
        Person person1 = new Person(1L,"Максим", "Муравьёв",  "Сергеевич","03.02.2002", Gender.MAN);
        repositoryPerson.save(person1.getId(),person1);

        Person person2 = new Person(2L,"Вася", "Пупкин", "Сергеевич" ,"08.02.2008",Gender.MAN);
        repositoryPerson.save(person2.getId(),person2);

        Person person3 = new Person(3L,"Мария", "Смирнова", "Сергеевна","06.05.1996",Gender.WOMAN);
        repositoryPerson.save(person3.getId(),person3);

        Person person4 = new Person(4L,"Вася", "Пугачев", "Алексеевич" ,"17.11.2011",Gender.MAN);
        repositoryPerson.save(person4.getId(), person4);
    }
}
