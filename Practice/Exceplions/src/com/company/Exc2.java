package com.company;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выполнено");
        } catch (ArithmeticException у){
            System.out.println("Деление на ноль");
        }
        System.out.println("После операции catch");

    }
}
