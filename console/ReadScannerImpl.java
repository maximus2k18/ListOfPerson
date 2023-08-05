package org.example.console;

import org.example.interfaces.ReadScanner;

import java.util.Scanner;

public class ReadScannerImpl implements ReadScanner {
    @Override
    public Long readScanLong(Scanner scanner) {
        return scanner.nextLong();
    }

    @Override
    public String readSсanString(Scanner scanner) {
        return scanner.nextLine();
    }

    public Integer readScanInt(Scanner scanner) {
        return scanner.nextInt();
    }
}
