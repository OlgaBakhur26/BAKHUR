package com.company;

import java.util.Arrays;
import java.util.Random;

public class ShakerSort {
    public static void main(String[] args) {

        // Создание массива
        int[] array = new int[10];
        Random num = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = num.nextInt(100);
        }
        System.out.println("Массив, полученный рандомом: " + Arrays.toString(array));


        // Сортировка
        int leftSide = 0;
        int rightSide = array.length - 1;
        int temp;

        while (leftSide < rightSide) {
            for (int j = leftSide; j < rightSide; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            rightSide--;
            for (int z = rightSide; z > leftSide ; z--) {
                if (array[z] < array[z - 1]){
                    temp = array[z];
                    array[z] = array[z - 1];
                    array[z - 1] = temp;
                }
            }
            leftSide++;
        }
        System.out.println("Упорядоченный массив: " + Arrays.toString(array));
    }
}
