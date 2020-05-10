package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions_2 {

    public static void main(String[] args)  {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе Main");
        }

    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("Text document");
        Scanner scanner = new Scanner(file);

    }
}
