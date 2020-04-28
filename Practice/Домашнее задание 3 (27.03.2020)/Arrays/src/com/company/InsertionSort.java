package com.company;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        // Создание массива
        int[] array = new int[10];
        Random num = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = num.nextInt(100);
        }
        System.out.println("Массив, полученный рандомом: " + Arrays.toString(array));

        // Сортировка
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
