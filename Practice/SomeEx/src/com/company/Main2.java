package com.company;

import java.util.ArrayList;

import static java.lang.String.join;

public class Main2 {
    public static void main(String[] args) {
        String str1 = "Fly";
        String str2 = "Talk";
        String str3 = "TALK";
        String str4 = "Fluffy";

        // concat(): объединяет строки
        System.out.println(str1.concat(str2)); // два объекта
        System.out.println(str1.concat("Who can?")); // объект и литерал

        //valueOf(): преобразует объект в строковый вид
        System.out.println(String.valueOf(str1));

        //join(): соединяет строки с учетом разделителя
//??
        //сompare(): сравнивает две строки
        //?? System.out.println(String.compare(str1, str2));

        //charAt(): возвращает символ строки по индексу
        System.out.println(str1.charAt(2));

        //getChars(): возвращает группу символов
       //??

        //equals(): сравнивает строки с учетом регистра
        System.out.println(str2.equals(str3));

        //equalsIgnoreCase(): сравнивает строки без учета регистра
        System.out.println(str2.equalsIgnoreCase(str3));

        //regionMatches(): сравнивает подстроки в строках
        //??

        //indexOf(): находит индекс первого вхождения подстроки в строку
        System.out.println(str4.indexOf('F'));

        //lastIndexOf(): находит индекс последнего вхождения подстроки в строку
        System.out.println(str4.lastIndexOf('f'));

        //startsWith(): определяет, начинается ли строка с подстроки
        System.out.println(str4.startsWith("Fl"));

        //endsWith(): определяет, заканчивается ли строка на определенную подстроку
        System.out.println(str4.endsWith("fy"));

        //replace(): заменяет в строке одну подстроку на другую
        System.out.println(str4);
        System.out.println(str4.replace("Fl", "Pu"));

        //trim(): удаляет начальные и конечные пробелы
        String str5 = "      olga      ";
        System.out.println(str5.trim());

        //substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        String str6 = "I want to watch a movie";
        System.out.println(str6.substring(7, 15)); // 15 не включительно

        //toLowerCase(): переводит все символы строки в нижний регистр
        System.out.println(str6.toLowerCase());

        //toUpperCase(): переводит все символы строки в верхний регистр
        System.out.println(str6.toUpperCase());




    }
}
