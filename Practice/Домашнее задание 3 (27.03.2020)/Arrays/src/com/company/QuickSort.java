package com.company;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        // Создание массива
        int[] array = new int[10];
        Random num = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = num.nextInt(100);
        }
        System.out.println("Массив, полученный рандомом: " + Arrays.toString(array));
    }

    // Сортировка
    public static int partition (int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }

        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
        return counter;
    }

    public static void quickSort (int[] array, int begin, int end) {
        if (end <= begin)
            return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}







