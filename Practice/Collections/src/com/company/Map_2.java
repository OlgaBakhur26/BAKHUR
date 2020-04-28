package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_2 {
    public static void main(String[] args) {
        // Создать 3 объекта разных Map-ов
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap); //внутри не гарантируется накакого порядка
        System.out.println();

        testMap(linkedHashMap); // гарантируется порядок добавления пар
        System.out.println();

        testMap(treeMap); // гарантирует, что пары будут отсортированы по ключу (естественный порядок)
        System.out.println(); // числа по возрастанию, а строки по лексико-графическому представлению
                              // a < b < c или aa < ab (00 < 01)
    }

    public static void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }


}
