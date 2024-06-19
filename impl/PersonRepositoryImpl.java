package org.example.impl;

import org.example.entity.Person;
import org.example.enums.Gender;
import org.example.interfaces.PersonRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class PersonRepositoryImpl implements PersonRepository {
    private Map<Long, Person> arrayListOfPerson = new HashMap();
    private Statement statement;
    private String tableName;

    public PersonRepositoryImpl(Statement statement, String tableName) throws SQLException {
        this.statement = statement;
        this.tableName = tableName;
    }

    public PersonRepositoryImpl() {

    }

    @Override
    public List<Person> getAll() throws SQLException {
        List<Person> listPerson = new ArrayList<>();
        String query = "SELECT * FROM "+tableName;
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Long my_id = resultSet.getLong("my_id");
            String last_name = resultSet.getString("last_name");
            String first_name = resultSet.getString("first_name");
            String middle_name= resultSet.getString("middle_name");
            Gender gender = Gender.valueOf(resultSet.getString("gender"));
            String address = resultSet.getString("address");
            String passport = resultSet.getString("passport");
            String date_b = resultSet.getString("date_b");
            String snils = resultSet.getString("snils");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            String bank_card_number= resultSet.getString("bank_card_number");
            String inn = resultSet.getString("inn");
            String medical_conditions = resultSet.getString("medical_conditions");


            Person person = new Person(my_id, last_name, first_name, middle_name, gender, address, passport, date_b, snils, email, phone, bank_card_number, inn, medical_conditions);
            System.out.println(person);
            listPerson.add(person);

        }
        //System.out.println(listPerson);
        return listPerson;
    }

    @Override
    public Person getById(Long id) {
        String query = "SELECT * FROM "+ tableName + " WHERE my_id =" +id;
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                // Извлекаем данные из resultSet и создаем объект Person
                Long my_id = resultSet.getLong("my_id");
                String last_name = resultSet.getString("last_name");
                String first_name = resultSet.getString("first_name");
                String middle_name= resultSet.getString("middle_name");
                Gender gender = Gender.valueOf(resultSet.getString("gender"));
                String address = resultSet.getString("address");
                String passport = resultSet.getString("passport");
                String date_b = resultSet.getString("date_b");
                String snils = resultSet.getString("snils");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String bank_card_number= resultSet.getString("bank_card_number");
                String inn = resultSet.getString("inn");
                String medical_conditions = resultSet.getString("medical_conditions");

                Person person = new Person(my_id, last_name, first_name, middle_name, gender, address, passport, date_b, snils, email, phone, bank_card_number, inn, medical_conditions);
                System.out.println(person);
                return person;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void save() throws SQLException {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO public.Person VALUES ('Беловововово', 'Дмитрий','Николаевич','M','ул. Никитская, д. 35, кв. 101', 4257444492 , '1966-09-23', '33529598004', 'vozos-oroto19@internet.ru',9683319971,4461469818228332,548452482890,'Краснуха')");
        statement.executeUpdate(query.toString());


        //query.append( "INSERT INTO "+tableName+" VALUES (");
        /*
        for (int count_columns = 0; count_columns<12; count_columns++){
            query.append("");
        }
        try {
            ResultSet resultSet = statement.executeQuery(query.toString());
            if (resultSet.next()) {
                // Извлекаем данные из resultSet и создаем объект Person
                Long my_id = resultSet.getLong("my_id");
                String last_name = resultSet.getString("last_name");
                String first_name = resultSet.getString("first_name");
                String middle_name= resultSet.getString("middle_name");
                Gender gender = Gender.valueOf(resultSet.getString("gender"));
                String address = resultSet.getString("address");
                String passport = resultSet.getString("passport");
                String date_b = resultSet.getString("date_b");
                String snils = resultSet.getString("snils");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String bank_card_number= resultSet.getString("bank_card_number");
                String inn = resultSet.getString("inn");
                String medical_conditions = resultSet.getString("medical_conditions");

                Person person = new Person(my_id, last_name, first_name, middle_name, gender, address, passport, date_b, snils, email, phone, bank_card_number, inn, medical_conditions);
                System.out.println(person);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

    }
    @Override
    public void delete(Long id) {
        arrayListOfPerson.remove(id);
    }

    @Override
    public void update(Long id) {

    }

    @Override
    public Person rename(Long id, Integer changeValue, String someName) {
        switch (changeValue){
            case 1:
                for (Map.Entry<Long, Person> entry:arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getId().equals(id)){
                        entry.getValue().setLastName(someName);
                        return entry.getValue();
                    }
                }
                break;
            case 2:
                for (Map.Entry<Long, Person> entry:arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getId().equals(id)){
                        entry.getValue().setFirst_name(someName);
                        return entry.getValue();
                    }
                }
                break;
            case 3:
                for (Map.Entry<Long, Person> entry:arrayListOfPerson.entrySet()) {
                    if (entry.getValue().getId().equals(id)){
                        entry.getValue().setMiddle_name(someName);
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
                    if (entry.getValue().getFirst_name().equals(value)) {
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
                    if (entry.getValue().getMiddle_name().equals(value)) {
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