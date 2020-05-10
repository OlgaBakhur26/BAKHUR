package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {

        int[] grades5 = {7, 2, 1, 72, 5};
        Arrays.sort(grades5); // отсортировать по возрастанию
        System.out.println("Sorted array: " + Arrays.toString(grades5));
        Arrays.parallelSort(grades5);
        System.out.println("Sorted array (parallel): " + Arrays.toString(grades5));


    }
}