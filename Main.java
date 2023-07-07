package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(0L, "Максим", "Муравьёв", "Сергеевич", "09.04.2002", false, false);
        Person person2 = new Person(1L, "Вася", "Пупкин", "Васильевич", "08.08.2008", false, false);
        Person person3 = new Person(2L, "Мария", "Смирнова", "Ивановна", "06.05.1996", true, true);

        RepositoryPerson.arrayListOfPerson.add(person1);
        RepositoryPerson.arrayListOfPerson.add(person2);
        RepositoryPerson.arrayListOfPerson.add(person3);
        ModificationPerson persons = new RepositoryPerson();


        System.out.println(person1);


        boolean flag =true;
        System.out.println("Введите действие с помощью числа!\n"
                +"1 - получить список персонала\n"
                +"2 - получить человека по id\n"
                +"3 - изменить имя\n"
                +"0 - закрыть меню\n");
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            int digit = scanner.nextInt();
            switch (digit) {
                case 1:
                    System.out.println("1 кейс");
                    break;
                case 2:
                    System.out.println("2 кейс");
                    break;
                case 3:
                    System.out.println("Введите id!");
                    Scanner scanner1 = new Scanner(System.in);
                    Long id = scanner1.nextLong();
                    System.out.println("Введите имя для замены!");
                    Scanner scanner2 = new Scanner(System.in);
                    String nameOfPerson =  scanner2.nextLine();
                    persons.rename(id, nameOfPerson);
                    System.out.println(person1.getName());
                    break;
                case 0:
                    System.out.println("3 кейс");
                    flag = false;
                default:
                    System.out.println("Нет такого числа в списке!");
                    break;
            }
        }
    }
}