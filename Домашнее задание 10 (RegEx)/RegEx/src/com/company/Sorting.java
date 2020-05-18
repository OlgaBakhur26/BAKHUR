package com.company;

import java.util.Map;

public class Sorting {
    public static void displayTop (Map<String, Integer> map){
        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
    }
}
