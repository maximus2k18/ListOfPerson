package org.example.dataBase.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPostgreSQL {
    public static Connection getConnection(String serverPort, String userName, String password) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver"); // Загружаем драйвер ConnectionPostgreSQL для работы с базой данных
        Connection connection = null; // Объявляем переменную для подключения к базе данных
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:"+serverPort+"/postgres",
                    userName, password); // Устанавливаем соединение с базой данных
            return connection;
        } catch (SQLException e) { // Ловим исключение, которое может возникнуть при подключении
            System.err.println("Ошибка подключения к базе данных: " + e.getMessage());
        }
        return null;
    }
}
