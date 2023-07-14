package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ModificationPerson {
    Set<Map.Entry <Long, Person>> getAll();
    Person getById(Long id);
    public Map save(Long id, Person person);
    void delete(Long id);
    Person add(Long id, String name, String lastName, String patronymicName, String dateOfBirth);
    Map search();
    Person rename(Long id);
}
