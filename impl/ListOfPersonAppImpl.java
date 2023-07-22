package org.example.impl;

import org.example.console.ListOfPersonAppOutput;
import org.example.console.ReadScannerImpl;
import org.example.entity.Person;
import org.example.enums.Gender;
import org.example.interfaces.AppInitialisation;
import org.example.interfaces.PersonRepository;
import org.example.scaner.ReadInputOfUserImpl;

import java.util.Random;
import java.util.Scanner;

public class ListOfPersonAppImpl  {
    
    public static  AppInitialisation appInitialisation = new AppInitialisationImpl();
    private static final ListOfPersonAppOutput listOfPersonAppOutput = new ListOfPersonAppOutput();
    private static final ReadScannerImpl readScanner  = new ReadScannerImpl();
    private static final ReadInputOfUserImpl readInputOfUser = new ReadInputOfUserImpl();
    public static void doRun(PersonRepository personRepository) {
        listOfPersonAppOutput.first_output();
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            int digit = scanner.nextInt();
            switch (digit) {
                case 1:
                    personRepository.getAll();
                    break;
                case 2:
                    listOfPersonAppOutput.outputTextForUser(digit); //вывод сообщения
                    System.out.println(personRepository.getById(readScanner.readScannerLong(readInputOfUser.createScanner())));
                    break;
                case 3:
                    listOfPersonAppOutput.outputNameForUser();
                    String name = readScanner.readSсannerString(readInputOfUser.createScanner());

                    listOfPersonAppOutput.outputLastNameForUser();
                    String lastName = readScanner.readSсannerString(readInputOfUser.createScanner());

                    listOfPersonAppOutput.outputPatronymicNameForUser();
                    String patronymicName = readScanner.readSсannerString(readInputOfUser.createScanner());

                    listOfPersonAppOutput.outputDateOfBirthForUser();
                    String dateOfBirth = readScanner.readSсannerString(readInputOfUser.createScanner());

                    listOfPersonAppOutput.outputGenderForUser();
                    String gender_1 = readScanner.readSсannerString(readInputOfUser.createScanner());
                    Gender gender;
                    if ("1".equals(gender_1)){
                        gender = Gender.MAN;
                    }
                    else{
                        gender = Gender.WOMAN;
                    }
                    Person person3 = appInitialisation.createPerson(name, lastName, patronymicName,dateOfBirth, gender);
                    personRepository.save(person3.getId(), person3);
                    listOfPersonAppOutput.outputSuccess();
                    break;
                case 4:
                    listOfPersonAppOutput.outputDelete();
                    Long number = readScanner.readScannerLong(readInputOfUser.createScanner());
                    personRepository.delete(number);
                    listOfPersonAppOutput.outputSuccess();
                    break;
                case 5:
                    listOfPersonAppOutput.outputTextForUser(3);
                    Long id5 = readScanner.readScannerLong(readInputOfUser.createScanner());

                    listOfPersonAppOutput.outputValueForUser();
                    int changeValue5 = readScanner.readScannerInt(readInputOfUser.createScanner());

                    listOfPersonAppOutput.outputChangeValueForUser();
                    String name5 = readScanner.readSсannerString(readInputOfUser.createScanner());

                    personRepository.rename(id5,changeValue5,name5);
                    listOfPersonAppOutput.outputSuccess();
                    break;
                case 6:
                    listOfPersonAppOutput.outputValueForUser();
                    Integer changeValue = readScanner.readScannerInt(readInputOfUser.createScanner());

                    listOfPersonAppOutput.outputSearchValueForUser();
                    String value6 = readScanner.readSсannerString(readInputOfUser.createScanner());
                    System.out.println(personRepository.search(changeValue,value6));

                    listOfPersonAppOutput.outputSuccess();
                    break;
                case 9:
                    listOfPersonAppOutput.first_output();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Нет такого числа в списке!");
                    break;
            }
        }
    }
}
