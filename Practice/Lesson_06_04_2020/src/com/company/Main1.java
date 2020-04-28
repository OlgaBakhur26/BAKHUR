package com.company;

import javax.swing.*;
import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        List<Person> data = new LinkedList();
        System.out.println(data);
        System.out.println(data.size());

        Random rnd = new Random();
        Date date = new Date(Math.abs(rnd.nextInt(Integer.MAX_VALUE) * 100_000));

        for (int i = 0; i < 100_000; i++) {
            data.add(new Person(String.valueOf(rnd.nextLong()),
                    String.valueOf(rnd.nextDouble()), new Date(Math.abs(rnd.nextInt(Integer.MAX_VALUE) * 100_000))));

        }
        System.out.println(data.size());


    }
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
