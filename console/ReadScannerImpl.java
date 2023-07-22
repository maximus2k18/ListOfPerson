package org.example.console;

import org.example.interfaces.ReadScanner;

import java.util.Scanner;

public class ReadScannerImpl implements ReadScanner {
    @Override
    public Long readScannerLong(Scanner scanner) {
        return scanner.nextLong();
    }

    @Override
    public String readSсannerString(Scanner scanner) {
        return scanner.nextLine();
    }

    @Override
    public Integer readScannerInt(Scanner scanner) {
        return scanner.nextInt();
    }
}
