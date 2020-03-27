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

        // Удаление повторяющихся цифр
        int newLength = array.length;

        // определяем количество неповторяющихся элементов, повторяющиеся заменяем нулями.
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                    newLength =  newLength - 1;
                }
            }
        }

        // Создаем новый массив длиной равной кольчеству неповторяющихся элементов
        int[] array2 = new int[newLength];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                for (int j = 0; j < newLength; j++) {
                    array2[j] = array[i];
                }

            }


        }

        System.out.println("Массив без повторяющихся элементов: " + Arrays.toString(array2));



        




        // Сортировка




    }
}
