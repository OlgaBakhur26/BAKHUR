package com.company;

public class Calculations {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2 = ?

        // 15 * 7 = 105 //x
        // 4.1 + 105 = 109.1 // y
        // 28/ 5 = 5.6 // z
        // 5.6 ^ 2 = 31.36 // w
        // 109.1 + 31.36 = 140.46 //r


        CalculatorWithOperators obj = new CalculatorWithOperators();
        double x = obj.multiplication(15, 7);
        double y = obj.addition(4.1, x);
        double z = obj.devision(28, 5);
        double w = obj.power (z, 2);
        double r = obj.addition(y, w);
        System.out.println("Результат: " + r);
    }
}
