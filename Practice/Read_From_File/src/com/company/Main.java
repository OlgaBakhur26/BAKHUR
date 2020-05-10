package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       //String separator = File.separator;
       String path = "E:\\Оля\\Programming\\Java Core course\\Practice\\Домашнее задание 5 (Война и мир)\\Война и мир.txt";
       File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
