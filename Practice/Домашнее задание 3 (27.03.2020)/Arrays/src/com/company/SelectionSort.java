package com.company;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        // Создание массива
        int[] array = new int[10];
        Random num = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = num.nextInt(100);
        }
        System.out.println("Массив, полученный рандомом: " + Arrays.toString(array));

        // Сортировка
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
        System.out.println("Упорядоченный массив: " + Arrays.toString(array));
    }
}
