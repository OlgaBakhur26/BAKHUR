package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {

    List<Integer> grades = new ArrayList<Integer>();
    grades.add(5);
    grades.add(10);

    System.out.println(grades.get(0));
    System.out.println(grades.get(1));

    grades.add(1, 7); // вставляем 7 на позицию 1. Заменяет 10, а 10 смещается на 1 позицию правее.
    System.out.println(grades.get(0));
    System.out.println(grades.get(1));
    System.out.println(grades.get(2)); // находим значение по индексу, но можно и наоборот

    System.out.println(grades.indexOf(7)); // находим индекс по значению 7. Это 1

    System.out.println(grades.contains(7)); // Проверяет есть ли указанное значение в списке. Возвращает boolean
        if (grades.contains(10)) {
            System.out.println("Значение 10 есть в списке");
        }
        if (!grades.isEmpty()){
            System.out.println("Список не пустой");
        }

        System.out.println(grades.remove(0)); // Удаляется указанный элемент, останьные сдвигаются влево.

        System.out.println(grades.get(0));
        System.out.println(grades.get(1));

//        grades.clear(); // очищает весь список. По идее распечатка индекса 0 должна давать Exception out of bounds
//        System.out.println(grades.get(0)); // да, дает ошибку




    }
}