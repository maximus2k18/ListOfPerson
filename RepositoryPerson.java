package org.example;

import java.util.*;

public class RepositoryPerson implements ModificationPerson{
    private Map <Long,Person> arrayListOfPerson = new HashMap();

    @Override
    public Set<Map.Entry <Long, Person>> getAll() {
        return arrayListOfPerson.entrySet();
    }

    @Override
    public Person getById(Long id) {
        return arrayListOfPerson.get(id);
    }

    @Override
    public Map save(Long id, Person person) {
        arrayListOfPerson.put(id,person);
        return arrayListOfPerson;
    }

    @Override
    public void delete(Long id) {
        arrayListOfPerson.remove(id);
    }

    @Override
    public Person add(Long id, String name, String lastName, String patronymicName, String dateOfBirth) {
        return null;
    }

    @Override
    public Map search() {
        return null;
    }

    @Override
    public Person rename(Long id) {
        return null;
    }


}
