package com.company;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        double average;

        for (i = 0; i < 5; i++)
            result = result + nums[i];
        average = result / 5;
        System.out.println("Average is: " + average);

        }

    }

