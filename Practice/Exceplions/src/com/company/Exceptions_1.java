package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions_1 {

    public static void main(String[] args)  {

        File file = new File("Text document");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После выбрасывания исключения дальше программа не выполняется и переходит в блок catch");
        } catch (FileNotFoundException e) {
            System.out.println("Файл \"" + file + "\" не найден");
        }
        finally {
            System.out.println("После блока try/ catch");
        }
    }

}
