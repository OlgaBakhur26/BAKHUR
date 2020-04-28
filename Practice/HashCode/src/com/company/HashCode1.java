package com.company;

import java.util.Arrays;

public class HashCode1 {

    public static void main(String[] args) {
        int [] [] grades13 = {
                {1, 5, 3},
                {8, 4, 2, 4, 3, 5, 3},
                {4, 6, 2}
        };

        // Найти хэшкод объекта
        int hCode1 = grades13.hashCode();
        System.out.println("Это хэшкод объекта grades13: " + hCode1);

        // Приравняем ссылки на один и тот же объект и убедимся, что хэшкоды совпадают
        int grades14 [][] = grades13;
        int hCode2 = grades14.hashCode();
        System.out.println("Это хэшкод объекта grades14: " + hCode2);

        // Создадим новый объект с теми же элементами
        int [] [] grades15 = {
                {1, 5, 3},
                {8, 4, 2, 4, 3, 5, 3},
                {4, 6, 2}
        };
        // И сравним его хэш-код с хэшкодом другого объекта, но с такими же элементами
        int hCode3 = grades15.hashCode();
        System.out.println("Это хэшкод объекта grades15: " + hCode3); // Хэш-коды разные,
        // потому что объекты разные, несмотря на то, что содержание одинаковое.

        // Проверим эквивалентность содержания массивов grades 14 and grades15.
        if (Arrays.deepEquals(grades14, grades15)) {
            System.out.println("Массивы grades14 и grades15 по содержанию одинаковы.");
        }
    }
}
