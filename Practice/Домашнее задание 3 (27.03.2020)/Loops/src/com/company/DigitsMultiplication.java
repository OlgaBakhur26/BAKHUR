package com.company;

public class DigitsMultiplication {
    public static void main(String[] args) {

        // Перемножить все цифры заданного числа
        int num = 87654321;
        int currentResult = 1;
        int finalResult;
        int counter = 0;

        for(num = 87654321; num != 0; num /= 10) {
            currentResult = currentResult * (num % 10);
            counter++;
            System.out.println("На итерации №" + counter + " результат вычисления равен " + currentResult + ".");
        }
        finalResult = currentResult;
        System.out.println("Финальный результат умножения всех цифр числа 87654321 равен " + finalResult + ".");
    }
}
