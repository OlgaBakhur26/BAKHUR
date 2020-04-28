package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        System.out.println("Введите целое число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 3) {
                try{
                    counter++;
                    int number = Integer.parseInt(scanner.nextLine());
                    if (number < 1 || number > 10){
                        throw new InputMismatchException();
                    } else
                        System.out.println("Правильный ввод.\nКонец программы");
                        break;
                }catch (NumberFormatException e){
                    System.out.println("Вы ввели не число, либо не целое число");
                } catch (InputMismatchException e){
                    System.out.println("Ваше число находится вне допустимого диапазона от 1 до 10.");
                }
        } if (counter == 3)
        System.out.println("Вы исчерпали все попытки.\nКонец программы");
    }
}
