package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {

        int[] grades4 = {1, 2, 3, 72, 72};
        for (int i = 0; i < grades4.length; i++) {
            if (grades4 [i] == 72) {
                System.out.println("FOUND! Found at index " + i);
            }
        }

    }
}