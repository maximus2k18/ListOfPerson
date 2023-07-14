package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ModificationPerson listRepoPerson = new RepositoryPerson();

        Person person0 = new Person(0L, "Максим", "Муравьёв",  "Сергеевич","09.04.2002");
        person0.setPatronymicName("Сергеевич");
        listRepoPerson.save(0l,person0);


        Person person1 = new Person(1L, "Вася", "Пупкин", "Сергеевич" ,"08.08.2008");
        listRepoPerson.save(1l,person1);

        Person person2 = new Person(2L, "Мария", "Смирнова", "Сергеевна","06.05.1996");
        listRepoPerson.save(2l,person2);



        Person person = new Person.Builder()
                .setId(1L)
                .setName("John")
                .setLastName("Doe")
                .setPatronymicName("Smith")
                .setDateOfBirth("01.01.1990")
                .build();
        Map<Long, Person> personnel = new HashMap<>();
        personnel.put(person.getId(),person);





        System.out.println("Введите действие с помощью числа!\n"
                +"1 - Получить список персонала\n"
                +"2 - Получить человека по id\n"
                +"3 - Сохранить человека\n"
                +"4 - Удалить человека\n"
                +"5 - Изменить \n"
                +"6 - Поиск\n"
                +"0 - Закрыть меню\n");
        boolean flag =true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            int digit = scanner.nextInt();
            switch (digit) {
                case 1:
                    /*if (listRepoPerson.size()==0){
                        System.out.println("Список пуст!");
                        break;
                    }*/
                    for (Map.Entry<Long,Person> pers:listRepoPerson.getAll()) {
                        System.out.println(pers);
                    }
                    break;
                case 2:
                    System.out.println("Вывод чела по id, введите id");
                    Scanner scanner2 = new Scanner(System.in);
                    Long digit2 = scanner2.nextLong();
                    System.out.println(listRepoPerson.getById(digit2));
                    break;
                case 3: //доделать
                    System.out.println("Сохранение, введите id");
                    Scanner scanner3 = new Scanner(System.in);
                    Long id = scanner3.nextLong();

                    Scanner scanner3_1 = new Scanner(System.in);
                    String name =  scanner3.nextLine();

                    listRepoPerson.save(id, person0);
                    System.out.println("Сохранено!");
                    break;
                case 4: //сделано
                    System.out.println("Удаление, введите id для удаления");
                    Scanner scanner4 = new Scanner(System.in);
                    Long number =  scanner4.nextLong();
                    listRepoPerson.delete(number);
                    System.out.println("Успешно удалено!");
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