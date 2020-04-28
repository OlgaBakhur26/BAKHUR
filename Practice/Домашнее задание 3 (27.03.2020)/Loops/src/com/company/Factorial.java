package com.company;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        // 2. Факториал числа (1 вариант)
        int maxValue = 10;
        int result = 1;

        for (int i = 1; i <= maxValue; i++) {
            result *= i;
        } System.out.println("Факториал числа " + maxValue + " равен: " + result);


        // 2. Факториал числа (2 вариант с большими числами)
        int maxValue2 = 1000;
        BigInteger result2 = new BigInteger("1");

        for (int j = 1; j <= maxValue2; j++) {
            result2 = result2.multiply(BigInteger.valueOf(j));
        } System.out.println("Факториал числа " + maxValue2 + " равен: " + result2);
    }
}
