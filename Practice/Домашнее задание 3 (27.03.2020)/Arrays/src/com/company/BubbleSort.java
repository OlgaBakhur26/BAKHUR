package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // Создание массива
        int[] array = {84, 95, 94, 11, 8, 107, 29, 6, 4, 33, 16, 72, 85, 1, 73};
        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        // Сортировка
        boolean notSorted = true;
        int temp;

        while (notSorted) {
            notSorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    notSorted = true;

                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }
}
