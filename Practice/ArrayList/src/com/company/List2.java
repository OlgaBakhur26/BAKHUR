package com.company;

import java.util.Arrays;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        int [] grades1 = {1, 4, 3 , 3};
        List<Integer> grades2 = Arrays.asList(5, 3, 2, 6, 3); // задать значения Листу
        System.out.println(Arrays.toString(grades2.toArray())); // Чтобы распечатать лист, надо его сначала
                                                                // преобразовать в массив, а потом .toString
    }
}
