package com.company.PublicPrivate;

public class OverLoadDemo2 {

        // Метод без параметров
        void test () {
            System.out.println("Параметры отсутствуют.");
        }

        // Метод с 2 целочисленными параметрами
        void test (int a, int b) {
            System.out.println("a и b: " + a + " " + b);
        }

        // Проверяет наличие параметра double. Тут перегружаетсяя тот же метод, но уже
        // с другим типом.
        void test (double a) {
            System.out.println("Внутреннее преобразование при вызове " + "test (double) a: " + a);
        }

    }

