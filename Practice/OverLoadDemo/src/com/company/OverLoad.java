package com.company;

public class OverLoad {
    public static void main(String[] args) {

        OverLoadDemo ob = new OverLoadDemo();
        double result;

        // Вызвать все перегрузки метода test
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}
