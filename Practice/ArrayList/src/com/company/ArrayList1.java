package com.company;

import java.util.ArrayList;

public class ArrayList1<I extends Number> {

    public static void main(String[] args) {
        // int[] sth = new int[]; - ordinary array

        ArrayList<Integer> grades = new ArrayList<Integer>(); // создание arrayList.

        grades.add(5); // Adding an element to thr arrayList. Поставило 5 на позицию индекса 0.
        System.out.println(grades.get(0)); // метод .get - чтобы получить число по индексу 0
        grades.set(0, 10); // заменяет число по индексу 0 на 10.
        System.out.println(grades.get(0)); // проверили. Заменило
        System.out.println(grades.size()); // показывает длину arrayList.









    }
}
