package org.example.impl;

import org.example.console.ListOfPersonAppOutputImpl;
import org.example.console.ReadScannerImpl;
import org.example.entity.Person;
import org.example.enums.Gender;
import org.example.interfaces.ListOfPersonAppOutput;
import org.example.interfaces.PersonRepository;

public class ListOfPersonAppImpl  {
    static ListOfPersonAppOutput ListOfPersonAppOutput = new ListOfPersonAppOutputImpl();
    static ReadScannerImpl readScanner = new ReadScannerImpl();

    public static void doRun(PersonRepository personRepository) {
        ListOfPersonAppOutput.first_output();
        boolean flag = true;
        while (flag) {
            String s = readScanner.readSсanString();
            ListOfPersonAppOutput.outputInstruction(s);
            switch (s) {
                case "1" -> personRepository.getAll();
                case "2" -> {
                    System.out.println(personRepository.getById(readScanner.readScanLong()));
                }
                case "3" -> {
                    String name = readScanner.readSсanString();
                    String lastName = readScanner.readSсanString();
                    String patronymicName = readScanner.readSсanString();
                    String dateOfBirth = readScanner.readSсanString();
                    String gender_1 = readScanner.readSсanString();
                    Gender gender;
                    if ("1".equals(gender_1)) {
                        gender = Gender.MAN;
                    } else {
                        gender = Gender.WOMAN;
                    }
                    Person persona = new Person(name, lastName, patronymicName, dateOfBirth, gender);
                    persona.createPerson(name, lastName, patronymicName, dateOfBirth, gender);
                    personRepository.save(persona.getId(),persona);
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