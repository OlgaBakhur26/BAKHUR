package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(5);
        data.add(17);
        data.add(28);
        System.out.println();

        // 1. способ итерации (for each)
        System.out.println("1-ый способ итерации (for each)");
        for (Integer item : data) {
            System.out.println(item);
        }
        System.out.println();

        // 2. способ итерации (for)
        System.out.println("2-ой способ итерации (for)");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(i);
        }
        System.out.println();

        // 3. способ итерации
        System.out.println("3-ий способ итерации. Итератор");
        Iterator<Integer> itr = data.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next()); // всего 4 элемента в списке и 4 раза уже запросили. Следующего нет -
        // NoSuchelementException с итератором, а не OutOfBoundsException, как без итератора в масиве
        System.out.println();

        System.out.println("Создали новый итератор и прошлись по всем элементом методом next(), " +
                "с использованием медода hasNext()");
        Iterator<Integer> itr2 = data.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }



    }
}
