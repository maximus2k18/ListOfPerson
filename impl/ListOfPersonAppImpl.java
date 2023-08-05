package org.example.impl;

import org.example.console.ListOfPersonAppOutputImpl;
import org.example.console.ReadScannerImpl;
import org.example.entity.Person;
import org.example.enums.Gender;
import org.example.interfaces.ListOfPersonAppOutput;
import org.example.interfaces.PersonRepository;
import org.example.scaner.ReadInputOfUserImpl;

public class ListOfPersonAppImpl  {
    static ListOfPersonAppOutput ListOfPersonAppOutput = new ListOfPersonAppOutputImpl();
    private static final ReadScannerImpl readScanner  = new ReadScannerImpl();
    private static final ReadInputOfUserImpl readInputOfUser = new ReadInputOfUserImpl();
    public static void doRun(PersonRepository personRepository) {
        ListOfPersonAppOutput.first_output();
        boolean flag = true;
        while (flag) {
            String s = readScanner.readSсanString(readInputOfUser.createScanner());
            ListOfPersonAppOutput.outputInstruction(s);
            switch (s) {
                case "1" -> personRepository.getAll();
                case "2" -> {
                    System.out.println(personRepository.getById(readScanner.readScanLong(readInputOfUser.createScanner())));
                }
                case "3" -> {
                    String name = readScanner.readSсanString(readInputOfUser.createScanner());
                    String lastName = readScanner.readSсanString(readInputOfUser.createScanner());
                    String patronymicName = readScanner.readSсanString(readInputOfUser.createScanner());
                    String dateOfBirth = readScanner.readSсanString(readInputOfUser.createScanner());
                    String gender_1 = readScanner.readSсanString(readInputOfUser.createScanner());
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
                    Long number4 = readScanner.readScanLong(readInputOfUser.createScanner());
                    personRepository.delete(number4);
                }
                case "5" -> {
                    Long id5 = readScanner.readScanLong(readInputOfUser.createScanner());
                    int changeValue5 = readScanner.readScanInt(readInputOfUser.createScanner());
                    String someName5 = readScanner.readSсanString(readInputOfUser.createScanner());
                    personRepository.rename(id5, changeValue5, someName5);
                }
                case "6" -> {
                    Integer changeValue = readScanner.readScanInt(readInputOfUser.createScanner());
                    String value6 = readScanner.readSсanString(readInputOfUser.createScanner());
                    System.out.println(personRepository.search(changeValue, value6));
                }
                case "9" -> ListOfPersonAppOutput.first_output();
                case "0" -> flag = false;
                default -> System.out.println("Нет такого значения!");
            }
        }
    }
}