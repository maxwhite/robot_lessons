package com.ua.java.lesson28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static final String FILE = "file.txt";

    public static void main(String[] args) {
        String stringToWrite = "Hello, world!";

        writeToFile(stringToWrite);
        System.out.println(readFromFile(FILE));
    }

    private static void writeToFile(String str) {
        Path file = Paths.get(FILE);
        try {
            Files.write(file, str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String readFromFile(String path) {
        Path file = Paths.get(path);
        String result = "";
        if(Files.exists(file)) {
            try {
                result = Files.readString(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }
}
