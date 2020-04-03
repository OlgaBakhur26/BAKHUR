package com.company;

public class Calculations {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2 = ?

        // 15 * 7 = 105 //x
        // 4.1 + 105 = 109.1 // y
        // 28/ 5 = 5.6 // z
        // 5.6 ^ 2 = 31.36 // w
        // 109.1 + 31.36 = 140.46 //r


        CalcWithOperators obj = new CalcWithOperators();
        double x = obj.multiplication(15, 7);
        double y = obj.adding(4.1, x);
        double z = obj.division(28, 5);
        double w = obj.power(z, 2);
        double r = obj.adding(y, w);
        System.out.println("Результат: " + r);

        //2.1. Сохранённый результат попробовать поделить на 0.
        System.out.println(r / 0); // Infinity, потому что это не целочисленное деление. Иначе была бы ошибка
        System.out.println(r / 0.0d); // Infinity. По той же причине.
    }
}