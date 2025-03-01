package com.company;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {

        // Создание массива
        int[] array = new int[10];
        Random num = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = num.nextInt(100);
        }
        System.out.println("Массив, полученный рандомом: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left)
            return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        for (int i = 0; i < lengthLeft; i++) {
            leftArray[i] = array[left + i];
        }

        for (int i = 0; i < lengthRight; i++) {
            rightArray[i] = array[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
