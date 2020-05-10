package com.company;

public class BreakWhile {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if (i == 10)
                break;
            System.out.println(i);
            i++;
        }
        System.out.println("Цикл завершен после 10 итераций.");
    }
}
