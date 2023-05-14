package com.ua.java.lesson27;

import java.io.*;

public class Main {

    private static final String FILE_NAME = "file.txt";

    private static final String TEXT = "Hello, World!";

    public static void main(String[] args) {
        writeStringToFile(TEXT);
        System.out.println(readFromFile());
    }

    private static void writeStringToFile(String str)  {

        try {
            FileOutputStream stream = new FileOutputStream(FILE_NAME);
            OutputStreamWriter writer = new OutputStreamWriter(stream);
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static String readFromFile() {
        char [] array = new char[100];
        StringBuilder builder = new StringBuilder();
        try {
            FileInputStream stream = new FileInputStream(FILE_NAME);
            InputStreamReader reader = new InputStreamReader(stream);
            int numberOfCharacters = reader.read(array);

            for(int i = 0; i < numberOfCharacters; i++ ){
                builder.append(array[i]);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return builder.toString();
    }
}
