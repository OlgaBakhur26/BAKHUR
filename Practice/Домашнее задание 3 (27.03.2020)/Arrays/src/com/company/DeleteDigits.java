package com.company;



import java.util.Arrays;
import java.util.Scanner;

public class DeleteDigits {
    public static void main(String[] args) {

        // Создание массива
        int[] array = new int[5];
        Scanner elements = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число");
            int userInput = elements.nextInt();
            array[i] = userInput;
        }
        String displayArray = Arrays.toString(array);
        System.out.println("Массив, введенный пользователем: " + displayArray + ".");

        // Посчитать длину нового массива, в который будем записывать уникальные элементы
        int newLength = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    newLength =  newLength - 1;
                }
            }
        }
        // создать новый массив с длиной, равной количеству уникальных элементов
        int[] array2 = new int[newLength];

        // Запишем во второй массив все уникальные элементы из первого. "
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    array2[k] = array[i];
                    k++;
                }
            }

        }System.out.println("Это второй массив: " + Arrays.toString(array2));
    }
    // Это не работает





}
