package org.example.impl;

import org.example.entity.Person;
import org.example.interfaces.PersonRepository;

import java.util.*;

public class PersonRepositoryImpl implements PersonRepository {

    private Map <Long, Person> arrayListOfPerson = new HashMap();
    @Override
    public Map getAll() {
        for (Map.Entry<Long,Person> entry:arrayListOfPerson.entrySet()) {
            System.out.println(entry);
        }
        return arrayListOfPerson;
    }
    @Override
    public Person getById(Long id) {
        for (Map.Entry<Long,Person> entry:arrayListOfPerson.entrySet()) {
            if (entry.getValue().getId().equals(id)){
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Person save(Long id, Person person) {
        arrayListOfPerson.put(id,person);
        return person;
    }
    @Override
    public void delete(Long id) {
        arrayListOfPerson.remove(id);
    }

    @Override
    public Person rename(Long id, Integer changeValue, String someName) {
        switch (changeValue){
            case 1:
                for (Map.Entry<Long,Person> entry:arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getId().equals(id)){
                        entry.getValue().setName(someName);
                        return entry.getValue();
                    }
                }
                break;
            case 2:
                for (Map.Entry<Long,Person> entry:arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getId().equals(id)){
                        entry.getValue().setLastName(someName);
                        return entry.getValue();
                    }
                }
                break;
            case 3:
                for (Map.Entry<Long,Person> entry:arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getId().equals(id)){
                        entry.getValue().setPatronymicName(someName);
                        return entry.getValue();
                    }
                }
                break;
            default:
                System.out.println("Нет такого значения в rename");
        }
        return null;
    }
    @Override
    public List<Long> search(int changeValue, String value) {
        List<Long> listId = new ArrayList<>();
        switch (changeValue) {
            case 1:
                for (Map.Entry<Long, Person> entry : arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getName().equals(value)) {
                        listId.add(entry.getValue().getId());
                    }
                }
                return listId;
            case 2:
                for (Map.Entry<Long, Person> entry : arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getLastName().equals(value)) {
                        listId.add(entry.getValue().getId());
                    }
                }
                return listId;
            case 3:
                for (Map.Entry<Long, Person> entry : arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getPatronymicName().equals(value)) {
                        listId.add(entry.getValue().getId());
                    }
                }
                return listId;
        }
        return listId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonRepositoryImpl that = (PersonRepositoryImpl) o;
        return Objects.equals(arrayListOfPerson, that.arrayListOfPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayListOfPerson);
    }
}