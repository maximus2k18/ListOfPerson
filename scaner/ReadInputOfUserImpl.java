package org.example.scaner;

import org.example.interfaces.ReadInputOfUser;

import java.util.Scanner;

public class ReadInputOfUserImpl implements ReadInputOfUser {
    @Override
    public Scanner createScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}
