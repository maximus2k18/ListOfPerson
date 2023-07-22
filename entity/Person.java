package org.example.entity;

import org.example.enums.Gender;

public class Person {
    private final Long id;
    private String name;
    private String lastName;
    private String patronymicName;
    private final String dateOfBirth;
    private final Gender gender;


    public Person(Long id, String name, String lastName, String patronymicName,String dateOfBirth, Gender gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
/*    public Person(String name, String lastName, String patronymicName,String dateOfBirth, Gender gender) {
    public Person(String name, String lastName, String patronymicName,String dateOfBirth, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }*/

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

