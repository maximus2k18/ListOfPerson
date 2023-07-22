package org.example.console;

public class ListOfPersonAppOutput extends ReadScannerImpl{
    //создать экз? сканера
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
    public void outputValueForUser(){
        System.out.println("Введите 1, чтобы ввести имя, 2 - фамилию, 3 - отчество");
    }

    public void outputDelete(){
        System.out.println("Удаление, введите id для удаления");
    }
    public void outputSuccess(){
        System.out.println("Успешно!");
    }
    public void outputNameForUser(){
        System.out.println("Введите имя");
    }
    public void outputSearchValueForUser(){
        System.out.println("Введите значение для поиска");
    }
    public void outputChangeValueForUser(){
        System.out.println("Введите значение для замены");
    }
    public void outputLastNameForUser(){
        System.out.println("Введите фамилию");
    }
    public void outputPatronymicNameForUser (){
        System.out.println("Введите отчество или оставьте пустым");
    }
    public void outputDateOfBirthForUser(){
        System.out.println("Введите дату рождения, например:  30.12.1999");
    }
    public void outputGenderForUser(){
        System.out.println("Введите 1, если мужчина, иначе 2");
    }
    public void outputTextForUser(int digit) {
        switch (digit) {
            case 2 -> System.out.println("Вывод человека по id, введите id");
            case 3 -> System.out.println("Введите id");
            case 9 -> first_output();
            default -> System.out.println("Нет такого числа в списке!");
        }

    }
}
