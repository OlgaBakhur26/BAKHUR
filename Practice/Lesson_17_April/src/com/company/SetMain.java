package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>();

        data.add("A");
        data.add("B");
        data.add("Z");
        data.add("C"); // возвращает в порядке возрастания hashCode

        for (String item : data) {
            System.out.println(item);
        }
        System.out.println();

        data.add("A"); // попробовать добавить уже существующий элемент. Не добавится
        data.add("H");
        for (String item : data) {
            System.out.println(item);
        }


    }
}
