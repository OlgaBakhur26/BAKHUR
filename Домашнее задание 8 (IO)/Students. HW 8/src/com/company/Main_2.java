package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main_2 {
    public static void main(String[] args){

        List<Students> studentsList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(new File("Students_1.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() != 0){
                Students st = (Students) ois.readObject();
                studentsList.add(st);
            }
            ois.close();
            fis.close();
        }catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка десериализации: " + e);
        }

        // Сортировка
        NameComparator comparator = new NameComparator();
        studentsList.sort(comparator);

        // Запись в файл
        try{
            FileWriter writer = new FileWriter("Students_2.txt");
            for(Students student : studentsList) {
                StringBuilder name = student.getName();
                int id = student.getId();
                writer.write("Name: " + name + ", " + "id: " + id + System.getProperty("line.separator"));
            }
            writer.close();
        }catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e);
        }





    }
}
