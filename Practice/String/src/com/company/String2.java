package com.company;

public class String2 {
    public static void main(String[] args) {
        String str1 = "Первая строка";
        String str2 = "Вторая строка!";
        String str3 = str1;

        // Найдем длины этих строк
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        // Распечатаем длины строк
        System.out.println("Длина первой строки: " + len1);
        System.out.println("Длина второй строки: " + len2);
        System.out.println("Длина третьей строки: " + len3);

        // Найдем символы по индексу
        char ch1 = str1.charAt(5);
        char ch2 = str2.charAt(8);
        char ch3 = str3.charAt(2);

        // Распечатаем эти символы
        System.out.println("В строке " + "\"" + str1 + "\"" + " символ под номером 5: " + ch1);
        System.out.println("В строке " + "\"" + str2 + "\"" + " символ под номером 8: " + ch2);
        System.out.println("В строке " + "\"" + str3 + "\"" + " символ под номером 2: " + ch3);

        // Сравнение содержимого строк происходит через equals().
        boolean x = str1.equals(str2);
        boolean y = str1.equals(str3);

        if (x)
            System.out.println("Строки str1 и str2 равны.");
        else
            System.out.println("Строки str1 и str2 НЕ равны");


        if (y)
            System.out.println("Строки str1 и str3 равны."); // Ссылаются на 2 объекта с разным содержанием. Не равны.
        else
            System.out.println("Строки str1 и str3 НЕ равны"); // ссылаются на один объект. Равны

        // Добавим новый объект с тем же содержанием, что и str2. И проверим равенство
        String str4 = "Вторая строка!";
        boolean z = str4.equals(str2);
        if (z)
            System.out.println("Строки str4 и str2 равны.");
        else
            System.out.println("Строки str4 и str2 НЕ равны");
        // Оказалось, что два разных объекта с одинаковым содержанием равны




    }
}
