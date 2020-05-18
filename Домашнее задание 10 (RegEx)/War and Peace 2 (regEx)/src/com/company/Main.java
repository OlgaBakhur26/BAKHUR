package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        String text = readAllBytesJava7("Война и мир.txt");

        Pattern p1 = Pattern.compile("\\b[Вв][Оо][Йй][Нн][\\S]*\\b");
        Matcher m1 = p1.matcher(text);

        Pattern p2 = Pattern.compile("\\b[Ии][^\\W]*\\b");
        Matcher m2 = p2.matcher(text);

        Pattern p3 = Pattern.compile("\\b[Мм][Ии][Рр][\\S]{0,3}\\b");
        Matcher m3 = p3.matcher(text);

        WordsCounter wordsCounter1 = new WordsCounter();
        WordsCounter wordsCounter2 = new WordsCounter();
        WordsCounter wordsCounter3 = new WordsCounter();

        System.out.println("Слово \"Война\" встретилось в тексте " + wordsCounter1.count(m1) + " раз.");
        System.out.println("Слово \"И\" встретилось в тексте " + wordsCounter2.count(m2) + " раз.");
        System.out.println("Слово \"Мир\" встретилось в тексте " + wordsCounter3.count(m3) + " раз.");
    }
}
