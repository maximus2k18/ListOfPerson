package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositoryPerson implements ModificationPerson{
    static ArrayList<Person> arrayListOfPerson = new ArrayList<>();
    @Override
    public List rename(Long id, String name) {
        for (Person pers : arrayListOfPeron) {
            if (pers.getId().equals(id)) {
                pers.setName(name);
            }
        }
        return arrayListOfPeron;
    }


    @Override
    public List<Person> getAll(Person persons) {
        for (Person pers: arrayListOfPerson) {
            System.out.println(pers);
        }
        return null;
    }

    @Override
    public Person getById(Long id) {
        Person foundPerson = null;
        for (Person pers:arrayListOfPerson) {
            if (pers.getId().equals(id)) {
                foundPerson = pers;
            break;
            }
        }
        System.out.println(foundPerson);
                return  foundPerson;
    }
    private ArrayList<Person> arrayListOfPeron = new ArrayList();

    @Override
    public Person save(Person person) {
        arrayListOfPeron.add(person);
        return person;
    }

    @Override
    public List<Person> delete(Long id) {
        for (Person pers : arrayListOfPeron) {
            if (pers.getId().equals(id)) {
                arrayListOfPeron.remove(pers);
                break;
            }
        }
        return arrayListOfPeron;
    }


    @Override
    public void search() {

    }



}
