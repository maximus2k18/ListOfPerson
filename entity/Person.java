package org.example.entity;

import org.example.enums.Gender;
public class Person {
    private Long id = 1L;

    private String name;
    private String lastName;
    private String patronymicName;
    private final String dateOfBirth;
    private final Gender gender;


    public Person(Long id, String name, String lastName, String patronymicName, String dateOfBirth, Gender gender) {
        this.id = ++id;
        this.name = name;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
    public Person createPerson(String name, String lastName, String patronymicName,
                               String dateOfBirth, Gender gender) {
        return new Person(id,name,lastName,patronymicName,dateOfBirth,gender);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
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

