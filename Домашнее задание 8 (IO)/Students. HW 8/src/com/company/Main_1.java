package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main_1 {

    public static void main(String[] args) {
        int randomID;
        StringBuilder randomName;
        int nameLength = 3 + (int)(Math.random()*7); // длина имени от 3 до 9 букв
        int idStart = 1_000_000; // Диапазон чисел для ID (от 1_000_000)
        int idEnd = 9_000_000; // Диапазон чисел для ID (до 9_999_999)
        int counter = 1;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        try{
            FileOutputStream f = new FileOutputStream(new File("Students_1.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            while(counter <= 100_000){
                randomName = new StringBuilder();
                for (int i = 0; i < nameLength; i++) {
                    randomName.append(alphabet.charAt((int) (Math.random() * alphabet.length())));
                }
                randomID = idStart + (int) (Math.random() * idEnd);
                Students student = new Students(randomName, randomID);
                o.writeObject(student);
                o.flush();
                counter++;
            }
            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Ошибка сериализации: " + e);
        }
    }
}
