package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Пользователь должен ввести число 10 максимум с 5 попыток.

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число 10. У вас есть 5 попыток.");
        int num = 0;
        int attempt = 0;

            while (num != 10 && attempt < 5) {
                num = scanner.nextInt();
                attempt++;

            }

    }
}
