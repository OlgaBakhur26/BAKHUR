package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1. Преобразовать строку в массив символов
    String a = "Mi name is Olga";
	char[] array = a.toCharArray();
        System.out.println(Arrays.toString(array));

        // распечаатать поотдельности элементы этого массива
        for (char ch : array)
            System.out.print(ch);
        System.out.println();

        //2. возвращает строку, составленную из части массива чаров
        char[] array2 = {'f', 'd', 's'};
        String str = new String();
        System.out.println(str.copyValueOf(array2));
        String someArrayStr = new String(array2);
        System.out.println("переделать массив в строку " + someArrayStr);

        // 3. Искать букву или строку в строке по интексу
        System.out.println(a.indexOf('g'));
        System.out.println(a.indexOf('n', 2));

        System.out.println(a.indexOf("Olga"));
        System.out.println(a.indexOf("name", 3));

        // 4. Заменить символы или часть строки в строке
        String oldtStr = "I like pizza";
        System.out.println(oldtStr);
        String newStr = oldtStr.replace('z', 'Z');
        System.out.println(newStr); // заменяет все такие символы. старая строка при этом не изменилась

        String oldtStr2 = "I love Java";
        System.out.println(oldtStr2);
        String newStr2 = oldtStr2.replace("Java", "my cat");
        System.out.println(newStr2);




    }
}
