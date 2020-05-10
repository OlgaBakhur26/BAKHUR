package com.company;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        // int [] [] grades11 = new int [3] [3]; // То же самое, что ниже, только без инициальзации
        int [] [] grades11 = {
                {1, 5, 3},
                {8, 4, 2},
                {4, 6, 2}
        };
        System.out.println(grades11[1][1]);
        System.out.println(Arrays.deepToString(grades11));

// Увеличиваем вложенный массив
        int [] [] grades12 = {
                {1, 5, 3},
                {8, 4, 2, 4, 3, 5, 3},
                {4, 6, 2}
        };
        System.out.println(grades12[1][4]);
        System.out.println(Arrays.deepToString(grades12));


    }
}
