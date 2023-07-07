package org.example;

public class Person {
    Long id;
    String name;
    String lastName;
    String patronymicName;
    String dateOfBirth;
    boolean woman = true;
    boolean married = true;

    public Person(Long id, String name, String lastName, String patronymicName, String dateOfBirth, boolean woman, boolean married) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
        this.woman = woman;
        this.married = married;
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

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isWoman() {
        return woman;
    }

    public void setWoman(boolean woman) {
        this.woman = woman;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", woman='" + woman + '\'' +
                ", married='" + married + '\'' +
                '}';
    }
}
