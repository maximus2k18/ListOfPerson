package org.example;

import java.util.List;

public interface ModificationPerson {
    List <Person> getAll(Person persons);
    Person getById(Long id);
    Person save(Person person);
    List<Person> delete(Long id);
    void search();
    List rename(Long id, String name);
}
