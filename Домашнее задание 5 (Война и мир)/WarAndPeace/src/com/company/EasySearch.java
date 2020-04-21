package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearch implements ISearchEngine {

    public static String readAllBytesJava7(String filePath){
        String content = "";
        try{
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }

    @Override
    public void search(String[] text, String word) {
        int counter = 0;
        for (String s : text) {
            if(s.equalsIgnoreCase(word)){
                counter++;
            }
        }System.out.println("Слово " + "\"" + word + "\"" + " встречается в тексе " + counter + " раз.");
    }

//   Тут не получилось
//    public void search2(String[] text, String word) {
//        int counter = 0;
//        for (String element : text) {
//            if(indexOf(word) != -1){
//                counter++;
//            }
//        } System.out.println("Слово " + "\"" + word + "\"" + " встречается в тексе " + counter + " раз.");
//
//    }

}
