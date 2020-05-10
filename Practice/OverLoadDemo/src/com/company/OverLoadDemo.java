package com.company;

public class OverLoadDemo {

    // Метод без параметров
    void test () {
        System.out.println("Параметры отсутствуют.");
    }

    // Метод с 1 целочисленным параметром
    void test (int a) {
        System.out.println("a: " + a);
    }

    // Метод с 2 целочисленными параметрами
    void test (int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Проверяет наличие параметра double. Тут перегружаетсяя тот же метод, но уже
    // с другим типом.
    double test (double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

}
