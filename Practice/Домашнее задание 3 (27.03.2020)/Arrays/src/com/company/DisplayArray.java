package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayArray {

    public static void main(String[] args) {

        int[] array = new int [3];
        Scanner elements = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число");
            int userInput = elements.nextInt();
            array[i] = userInput;
        }
        String displayArray = Arrays.toString(array);
        System.out.println("Массив, введенный пользователем: " + displayArray + ".");

        // Вывод всех элементов массива с помощью цикла for.
        System.out.print("Вывод всех элементов массива с помощью цикла for: ");
        for (int j = 0; j < array.length; j++) {
            int x = array[j];
            System.out.print(x + " ");
        }
        System.out.println();


        // Вывод всех элементов массива с помощью цикла for в стиле for each.
        System.out.print("Вывод всех элементов массива с помощью цикла for в стиле for each: ");
        for (int a: array) {
            System.out.print(a + " ");
        }
        System.out.println();

        // Вывод всех элементов массива с помощью цикла while.
        System.out.print("Вывод всех элементов массива с помощью цикла while: ");
        int b = 0;
        while (b < array.length){
            System.out.print(array[b] + " ");
            b++;
        } System.out.println();

        // Вывод всех элементов массива с помощью цикла do... while.
        int c = 0;
        System.out.print("Вывод всех элементов массива с помощью цикла do... while: ");
        do {
            System.out.print(array[c] + " ");
            c++;
        } while (c < array.length);
    }
}
