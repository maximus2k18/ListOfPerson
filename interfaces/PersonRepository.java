package org.example.interfaces;

import org.example.entity.Person;

import java.sql.SQLException;
import java.util.List;

public interface PersonRepository {
    List<Person> getAll() throws SQLException;
    Person getById(Long id);
    public void save() throws SQLException;
    void delete(Long id);
    void update(Long id);
    List<Long> search(int changeValue, String value);
    Person rename(Long id, Integer changeValue, String someName);
}