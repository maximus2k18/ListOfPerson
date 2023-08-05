package org.example.impl;

import org.example.entity.Person;
import org.example.interfaces.PersonRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            if (entry.getValue().getId()==id){
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
    public Person rename(Long id, int changeValue, String valueName) {
        switch (changeValue){
            case 1:
                arrayListOfPerson.get(id).setName(valueName);
                return arrayListOfPerson.get(id);
            case 2:
                arrayListOfPerson.get(id).setLastName(valueName);
                return arrayListOfPerson.get(id);
            case 3:
                arrayListOfPerson.get(id).setPatronymicName(valueName);
                return arrayListOfPerson.get(id);
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
}