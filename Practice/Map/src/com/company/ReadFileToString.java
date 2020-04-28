package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ReadFileToString {
    public static void main(String[] args) {
        String text = readAllBytesJava7("Война и мир.txt");
        String[] words = text.split(" ");

        Map<String, Integer> data = new HashMap<>();

        for (String word : words) {
            if (data.containsKey(word)){
                data.put(word, data.get(word) + 1);
            }else{
                data.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }


    private static String readAllBytesJava7(String filePath){
        String content = "";
        try{
            content = new String (Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e){
                e.printStackTrace();
        }
            return content;
        }

}

