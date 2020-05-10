package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int [] grades3 = new int [10];
        System.out.println("The array before filling: " + Arrays.toString(grades3));
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int x = input.nextInt(); // Заполняет массив со сканера
            grades3 [i] = x;
        }
        System.out.println("The array after filling: " + Arrays.toString(grades3));
    }
}
