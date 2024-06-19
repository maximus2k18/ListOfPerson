package org.example.entity;

import org.example.enums.Gender;


public class Person {
    private static Long idCounter = 1L;
    public Long my_id;
    private String lastName;
    private String first_name;
    private String middle_name;
    private Gender gender;
    private String address;
    private String passport;
    private String date_b;
    private String snils;
    private String email;
    private String phone;
    private String bank_card_number;
    private String inn;
    private String medical_conditions;

    public Person(Long my_id, String lastName, String first_name, String middle_name, Gender gender, String address, String passport, String date_b, String snils, String email, String phone, String bank_card_number, String inn, String medical_conditions) {
        this.my_id = my_id;
        this.lastName = lastName;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.gender = gender;
        this.address = address;
        this.passport = passport;
        this.date_b = date_b;
        this.snils = snils;
        this.email = email;
        this.phone = phone;
        this.bank_card_number = bank_card_number;
        this.inn = inn;
        this.medical_conditions = medical_conditions;
    }

    public Person(String lastName, String first_name, String middle_name, Gender gender, String address, String passport, String date_b, String snils, String email, String phone, String bank_card_number, String inn, String medical_conditions) {
        this.my_id = idCounter; // было ++idCounter из-за смены типа данных
        this.lastName = lastName;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.gender = gender;
        this.address = address;
        this.passport = passport;
        this.date_b = date_b;
        this.snils = snils;
        this.email = email;
        this.phone = phone;
        this.bank_card_number = bank_card_number;
        this.inn = inn;
        this.medical_conditions = medical_conditions;
    }

    public Person createPerson(String lastName, String first_name, String middle_name, Gender gender, String address, String passport, String date_b, String snils, String email, String phone, String bank_card_number, String inn, String medical_conditions) {
        return new Person(idCounter, lastName, first_name, middle_name, gender, address, passport, date_b, snils, email, phone, bank_card_number, inn, medical_conditions);
    }
    public Long getId() {
        return my_id;
    }

    public void setId(Long id) {
        this.my_id = id;
    }

    public static Long getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(Long idCounter) {
        Person.idCounter = idCounter;
    }

    public Long getMy_id() {
        return my_id;
    }

    public void setMy_id(Long my_id) {
        this.my_id = my_id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDate_b() {
        return date_b;
    }

    public void setDate_b(String date_b) {
        this.date_b = date_b;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBank_card_number() {
        return bank_card_number;
    }

    public void setBank_card_number(String bank_card_number) {
        this.bank_card_number = bank_card_number;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getMedical_conditions() {
        return medical_conditions;
    }

    public void setMedical_conditions(String medical_conditions) {
        this.medical_conditions = medical_conditions;
    }

    @Override
    public String toString() {
        return "Person{" +
                "my_id=" + my_id +
                ", lastName='" + lastName + '\'' +
                ", first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", passport='" + passport + '\'' +
                ", date_b='" + date_b + '\'' +
                ", snils='" + snils + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", bank_card_number='" + bank_card_number + '\'' +
                ", inn='" + inn + '\'' +
                ", medical_conditions='" + medical_conditions + '\'' +
                '}';
    }
}

