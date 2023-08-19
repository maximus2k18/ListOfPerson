package org.example.interfaces;

import org.example.entity.Person;

import java.util.List;
import java.util.Map;

public interface PersonRepository {
    Map getAll();
    Person getById(Long id);
    Person save(Long id, Person person);
    void delete(Long id);
    List<Long> search(int changeValue, String value);
    Person rename(Long id, Integer changeValue, String someName);
}