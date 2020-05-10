package com.company;


public class StringArray {
    public static void main(String[] args) {
        String str1[] = {"One", "Two", "Three"};
        String str2[][] = {
                {"Один"},
                {"Два"},
                {"Три"}
        };
        int len1 = str1.length;
        int len2 = str2.length;
        int len3 = str2[0].length;
        System.out.println("Длина массива str1: " + len1);
        System.out.println("Длина массива str2: " + len2);
        System.out.println("Длина вложенного массива по индексу 0 в str2: " + len3); // почему-то со строками-подмассивами
        // не работае. Длина должна быть 4, а выводит 1.

       // Выводит элементы массива с распечиткой их адреса
        for (int i = 0; i < str1.length; i++) {
            System.out.println("str1 [" + i + "]: " + str1[i]);
        }


        // Посчитаем длину числовых подмассивов
        int str5[][] = {
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2, 3, 4, 5}
        };
        int len5 = str5.length;
        int len51 = str5[0].length;
        int len52 = str5[1].length;
        int len53 = str5[2].length;
        System.out.println("Длина массива str5: " + len5);
        System.out.println("Длина подмассива по индексу 0 в str5: " + len51);
        System.out.println("Длина подмассива по индексу 1 в str5: " + len52);
        System.out.println("Длина подмассива по индексу 2 в str5: " + len53);


    }
}
