package org.example.console;

import org.example.interfaces.ReadScanner;

import java.util.Scanner;

public class ReadScannerImpl implements ReadScanner {
    private Scanner scanner;
    public ReadScannerImpl() {
        this.scanner = createScanner();
    }

    @Override
    public Scanner createScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    @Override
    public Long readScanLong() {
        return scanner.nextLong();
    }

    @Override
    public String readSсanString() {
        return scanner.nextLine();
    }

    public Integer readScanInt() {
        return scanner.nextInt();
    }
}
