package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

// Java 5
        for(int x : list){
            System.out.println(x);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

// Удалить элемент из списка в тот момент, коогда мы по нему проходимся. Это можно сделать только через
// Итератор, но нельзя изменять лист во время прохождения по нему через цикл for each

        Iterator<Integer> iterator2 = list.iterator();
        int idx = 0;
        while (iterator.hasNext()){
            if (idx == 1)
                System.out.println(iterator2.next());
            iterator2.remove();

            idx++;
        }
        System.out.println(list);










    }

}
