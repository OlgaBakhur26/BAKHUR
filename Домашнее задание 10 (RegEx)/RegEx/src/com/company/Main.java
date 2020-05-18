package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static String readAllBytesJava7(String filePath){
        String content = "";
        try{
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args) {
        String text = readAllBytesJava7("Benign_list_big_final.csv");
        List<String> urls = Arrays.asList(text.split("\\s+"));

        Map<String, Integer> group1 = new LinkedHashMap<>();
        Map<String, Integer> group2 = new LinkedHashMap<>();
        Map<String, Integer> group3 = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile("(http|https)://([^.]+\\.([^/]+)).*");

        for (String url : urls) {
            Matcher matcher = pattern.matcher(url);
            if(matcher.matches()){
                if(!group1.containsKey(matcher.group(1))){
                    group1.put(matcher.group(1), 1);
                }else {
                    group1.put(matcher.group(1), group1.get(matcher.group(1)) + 1);
                }

                if(!group2.containsKey(matcher.group(2))){
                    group2.put(matcher.group(2), 1);
                }else {
                    group2.put(matcher.group(2), group2.get(matcher.group(2)) + 1);
                }

                if(!group3.containsKey(matcher.group(3))){
                    group3.put(matcher.group(3), 1);
                }else {
                    group3.put(matcher.group(3), group3.get(matcher.group(3)) + 1);
                }
            }else
                System.out.println("Некорректный URL: " + url);
        }

        System.out.println("ТОП ПРОТОКОЛОВ:");
        Sorting.displayTop(group1);
        System.out.println();

        System.out.println("ТОП ДОМЕНОВ:");
        Sorting.displayTop(group2);
        System.out.println();

        System.out.println("ТОП ДОМЕНОВ ВЕРХНЕГО УРОВНЯ:");
        Sorting.displayTop(group3);
        System.out.println();
    }
}
