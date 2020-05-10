package com.company;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
	int [] grades1 = {9, 7, 6, 10, 5, 8, 9, 10, 8, 4};
        System.out.println("One Dimension array");
	    System.out.println("Print without a method: " + grades1);
        System.out.println("Print with the method " + Arrays.toString(grades1));

        System.out.println("Two Dimensions array");
        int [] [] grades2 = {{9, 7, 6, 10}, {5, 8, 9, 10, 8, 4}};
        System.out.println("Print without a method: " + grades2);
        System.out.println("Print with the method " + Arrays.deepToString(grades2));

    }
}
