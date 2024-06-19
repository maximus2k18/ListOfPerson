package org.example.impl;

import org.example.console.ListOfPersonAppOutputImpl;
import org.example.console.ReadScannerImpl;
import org.example.dataBase.postgresql.ConnectionPostgreSQL;
import org.example.entity.Person;
import org.example.enums.Gender;
import org.example.interfaces.ListOfPersonAppOutput;
import org.example.interfaces.PersonRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ListOfPersonAppImpl  {

    static ListOfPersonAppOutput ListOfPersonAppOutput = new ListOfPersonAppOutputImpl();
    static ReadScannerImpl readScanner = new ReadScannerImpl();

    public static void doRun(PersonRepository listRepoPerson) throws ClassNotFoundException, SQLException {
        // Подключение к БД
        String tableName = "person";
        String password = "123456";
        String userName = "postgres";
        String serverPort = "5433";
        Connection connection = ConnectionPostgreSQL.getConnection(serverPort, userName, password);
        Statement statement = connection.createStatement(); // Создаем объект для выполнения SQL-запросов

        PersonRepository personRepository = new PersonRepositoryImpl(statement, tableName); // Создайте экземпляр


        ListOfPersonAppOutput.first_output();
        boolean flag = true;
        while (flag) {
            String s = readScanner.readSсanString();
            ListOfPersonAppOutput.outputInstruction(s);
            switch (s) {
                case "1" -> personRepository.getAll();
                case "2" -> {
                    Long number2 = readScanner.readScanLong();
                    personRepository.getById(number2);
                }
                case "3" -> {
                    String lastName = readScanner.readSсanString();
                    String first_name = readScanner.readSсanString();
                    String middle_name = readScanner.readSсanString();
                    String gender_1 = readScanner.readSсanString();
                    String address = readScanner.readSсanString();
                    String passport = readScanner.readSсanString();
                    String date_b = readScanner.readSсanString();
                    String snils = readScanner.readSсanString();
                    String email = readScanner.readSсanString();
                    String phone = readScanner.readSсanString();
                    String bank_card_number = readScanner.readSсanString();
                    String inn = readScanner.readSсanString();
                    String medical_conditions = readScanner.readSсanString();

                    Gender gender;
                    if ("1".equals(gender_1)) {
                        gender = Gender.M;
                    } else {
                        gender = Gender.W;
                    }

                   /* Person persona = new Person(lastName, first_name, middle_name, gender, address, passport, date_b, snils, email, phone, bank_card_number, inn, medical_conditions);
                    persona.createPerson(lastName, first_name, middle_name, gender, address, passport, date_b, snils, email, phone, bank_card_number, inn, medical_conditions);*/
                }
                case "4" -> {
                    Long number4 = readScanner.readScanLong();
                    personRepository.delete(number4);
                }
                case "5" -> {
                    Long id5 = readScanner.readScanLong();
                    Integer changeValue5 = readScanner.readScanInt();
                    String someName5 = readScanner.readSсanString();
                    personRepository.rename(id5, changeValue5, someName5);
                }
                case "6" -> {
                    Integer changeValue = readScanner.readScanInt();
                    String value6 = readScanner.readSсanString();
                    System.out.println(personRepository.search(changeValue, value6));
                }
                case "0" -> flag = false;
            }
        }
    }
}