package com.company;

public class BreakFor {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10)
                break;
            System.out.println(i);
        }

        System.out.println("Цикл завершен после 10 итераций");
    }
}
