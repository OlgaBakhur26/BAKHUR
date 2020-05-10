package com.company;

import static com.company.EasySearch.readAllBytesJava7;

public class Main {
    public static void main(String[] args) {
       String text = readAllBytesJava7("Война и мир.txt");
        text = text.replaceAll("\\.|\\,|\\!|\\?|\\:|\\...|\\-|\\(|\\)|\\\"|\\;", " ").trim(); // убрать знаки препинания
       String[] words = text.split(" "); // разделить на слова по пробелам

       EasySearch obj = new EasySearch();
       obj.search(words, "война");
       obj.search(words, "и");
       obj.search(words, "мир");

    }
}
