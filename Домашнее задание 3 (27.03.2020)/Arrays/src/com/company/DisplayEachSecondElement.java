package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayEachSecondElement {

    // Вывести каждый второй элемент массива
    public static void main(String[] args) {

        int[] array = new int [5];
        Scanner elements = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число");
            int userInput = elements.nextInt();
            array[i] = userInput;
        }
        String displayArray = Arrays.toString(array);
        System.out.println("Массив, введенный пользователем: " + displayArray + ".");

        System.out.print("Вывод каждого второго элемента массива: ");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 != 0) {
                int x = array[j];
                System.out.print(x + " ");
            }
        }
        
    }
}
