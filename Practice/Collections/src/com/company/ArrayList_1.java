package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_1 {

    public static void main(String[] args) {
// Создать ArrayList
        List<Integer> list = new ArrayList<Integer>();

// Добавить элементы методом .add
// Распечатать ArrayList
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.print("Добавить элементы методом .add и распечатать ArrayList: ");
        System.out.println(list); // у ArrayList переопределен метод toString, поэтому не надо писать
                                       // Arrays.ToString(list). И так распечатается

// Метод .get
        System.out.println(list.get(0));
        System.out.println(list.get(9));

// Метод .size
        System.out.println(list.size());

// Пройти по всем элементам циклом обычный  for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\n");
        }

// Пройти по всем элементам циклом обычный  for each
        System.out.println("Пройти по всем элементам циклом обычный  for each");
        for (Integer item : list) {
            System.out.print(item + "\n");
        }

// Метод .remove()
        list.remove(5);
        System.out.println(list);

// Можно поменять реализацию
list = new LinkedList<>(); // Это благодаря тому, что сверху в объявлении в левой части List, а не ArrayList, как в правой.



    }
}
