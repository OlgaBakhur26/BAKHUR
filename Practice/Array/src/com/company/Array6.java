package com.company;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int [] grades6 = {1, 2, 3, 72, 5};
        int [] grades7 = {1, 2, 3, 72, 5};

        if (grades6 == grades7) {
            System.out.println("Equals"); // No result
        }

        if (grades6.equals(grades7)) {
            System.out.println("Equals"); // Without curly brackets it works, and I obtained the result "Equals".
                                          // because these are two different methods.
        }

        System.out.println(grades6 + " " + grades7); // to check their addresses in the memory
        if (Arrays.equals(grades6, grades7)) { // Сравнение для одномерных массивов
            System.out.println("Finally equals!");
    }


        // Двумерные массивы
        int [] [] grades8 = {{1, 2}, {3, 72, 5}};
        int [] [] grades9 = {{1, 2}, {3, 72, 5}};

        if (Arrays.deepEquals(grades8, grades9)) { // Сравнение для многомерных массивов
            System.out.println("Multi-dimension arrays are equal!");
        } else
            System.out.println("Multi-dimension arrays are not equal!");



    }
}
