package com.company;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Animal_Main {
    public static void main(String[] args) {
        List<Animal> animalList = new LinkedList();

        Random rnd = new Random();

        for (int i = 0; i < 100_000; i++) {
            animalList.add(new Animal(String.valueOf(rnd.nextInt()),
                    rnd.nextInt()));

        }
        System.out.println(animalList.size());

        private static void sort (List<Person> data, Comparator<Person> comparator){
            Person currentArrayElement;
            for (int i = 0; i < data.size(); i++) {
                currentArrayElement = data.get(i);
                int j = i;
                while ((j - 1) >= 0 && comparator.compare(currentArrayElement, data.get(j - 1)) < 0){
                    j--;
                }
                data.set(j, currentArrayElement);
            }

        }







    }
}
