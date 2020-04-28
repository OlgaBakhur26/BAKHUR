package com.company;

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int [] grades10 = {1, 2, 3, 72, 5};
        Arrays.fill(grades10, 72);
        System.out.println("Интовый массив" + Arrays.toString(grades10));

        String [] grades11 = new String [5]; // Автозаполнение null
        Arrays.fill(grades11, ""); // перезаполняется пробелами через запятую в квадратных скобках
        System.out.println(Arrays.toString(grades11));
    }
}
