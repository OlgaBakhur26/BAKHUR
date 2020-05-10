package com.company;

import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {

        int [] [] grades13 = {
                {1, 5, 3},
                {8, 4, 2, 4, 3, 5, 3},
                {4, 6, 2}
        };
        System.out.println("Длина одномерного массива: " + grades13.length);
        System.out.println("Длина вложенного массива по индексу 0: " + grades13[0].length);
        System.out.println("Длина вложенного массива по индексу 1: "+ grades13[1].length);
        System.out.println("Длина вложенного массива по индексу 2: " + grades13[2].length);

        for (int row = 0; row < grades13.length; row++) { // Строки 0, 1, 2
            for (int column = 0; column < grades13[row].length; column++) {
                System.out.print(grades13[row][column] + " ");
                
            }
            System.out.println();
            
        }



    }
}
