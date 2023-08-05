package org.example.console;

import org.example.interfaces.ListOfPersonAppOutput;

import java.io.File;

public class ListOfPersonAppOutputImpl implements ListOfPersonAppOutput {
    @Override
    public void first_output() {
        System.out.println("""
                Введите действие с помощью числа!
                1 - Получить список персонала
                2 - Получить человека по id
                3 - Сохранить человека
                4 - Удалить человека
                5 - Изменить
                6 - Поиск
                9 - Список действий консоли
                0 - Закрыть консоль
                """);
    }
    public void outputInstruction(String s){
        switch (s) {
            case "2" -> System.out.println("Вывод человека по id, введите id");
            case "3" -> System.out.println("Введите имя\nВведите фамилию" +
                    "\nВведите отчество, если есть" +
                    "\nВведите дату рождения, например: 30.12.1999" +
                    "\nВведите 1, если Вы мужчина, иначе 2");
            case "4" -> System.out.println("Удаление, введите id для удаления");
            case "5" -> System.out.println("Введите id для изменения человека\nВведите цифрой что изменить: 1 - имя" +
                    " 2 - фамилию, 3 - отчество\nВведите на что хотите изменить ");
            case "6" -> System.out.println("Введите 1, чтобы искать имя, 2 - фамилию, 3 - отчество\n" +
                    "Введите значение для поиска");
            case "9" -> first_output(); 
        }
    }
}