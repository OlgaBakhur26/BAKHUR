package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int randomMark;
        StringBuilder randomName;
        int nameLength = 3 + (int)(Math.random()*7); // длина имени от 3 до 9 букв
        int counter = 1;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<Students> studentsList = new ArrayList<>();

        while(counter <= 1000){
            randomName = new StringBuilder();
            for (int i = 0; i < nameLength; i++) {
                randomName.append(alphabet.charAt((int) (Math.random() * alphabet.length())));
            }
            randomMark = (int) (Math.random() * 11); // оценка от 0 до 10
            Students student = new Students(randomName, randomMark);
            studentsList.add(student);
            counter++;

        }
        List<Students> bestStudentsList = new ArrayList<>();
        Stream<Students> studentsStream = studentsList.stream().filter((n) -> (n.getMark() >= 7));
        studentsStream.forEach(bestStudentsList::add);

        try{
            FileOutputStream f = new FileOutputStream(new File("Best students.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            for (Students student : bestStudentsList) {
                o.writeObject(student);
                o.flush();
            }
            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Ошибка сериализации: " + e);
        }

        try{
            FileInputStream fis = new FileInputStream(new File("Best students.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("Список студентов с оценкой 7 и выше: ");
            while(fis.available() != 0){
                Students st = (Students) ois.readObject();
                System.out.println(st);
            }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка десериализации: " + e);
        }
        System.out.println();

        System.out.println("(Вывод через stream) \nСписок ВСЕХ студентов: ");
        studentsStream  = studentsList.stream();
        studentsStream.forEach(System.out::println);

        System.out.println(bestStudentsList.size());
        System.out.println(studentsList.size());
    }
}
