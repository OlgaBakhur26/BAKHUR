package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        int size = input2.nextInt();

        int[] grades3 = new int[size];
        System.out.println("The array before filling: " + Arrays.toString(grades3)); // автоматом заполнился нулями

        for (int i = 0; i < size; i++) {
            int x = input2.nextInt(); // Заполняет массив со сканера
            grades3[i] = x;
        }
        System.out.println("The array after filling: " + Arrays.toString(grades3));
    }
}