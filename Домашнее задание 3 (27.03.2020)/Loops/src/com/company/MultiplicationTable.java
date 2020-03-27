package com.company;

public class MultiplicationTable {

    public static void main(String[] args) {

        // 1. Таблица умножения
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        int result = i * j;
                        System.out.print(result + "\t");
                    } System.out.println();
                }
    }
}
