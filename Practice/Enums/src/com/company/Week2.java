package com.company;

import org.w3c.dom.ls.LSOutput;

public class Week2 {
    public static void main(String[] args) {
        System.out.println("Week.MONDAY.name(): " + Week.MONDAY.name());
        System.out.println("Week.MONDAY.ordinal(): " + Week.MONDAY.ordinal());

        // .equals()
        boolean isEqualToItself = Week.MONDAY.equals(Week.MONDAY);
        boolean isEqualToDifferentDay = Week.MONDAY.equals(Week.TUESDAY);
        System.out.println(".equals(): " + isEqualToItself);
        System.out.println(".equals(): " + isEqualToDifferentDay);

        // Поскольку элементы энама являются константами, то существует только один экземпляр такой константы,
        // значит их можно сравнивать даже по ссылкам через ==.
        if (Week.MONDAY == Week.MONDAY)
            System.out.println("Сравнение по ссылкам работает");
        else
            System.out.println("Сравнение по ссылкам НЕ работает");

        if (Week.MONDAY == Week.TUESDAY)
            System.out.println("Сравнение по ссылкам работает");
        else
            System.out.println("Объекты не равны");

        // .toString()
        System.out.println(".toString(): " + Week.MONDAY.toString());

        // .valueOf - для одного элемента энами
        System.out.println(".valueOf: " + Week.valueOf("MONDAY"));
        System.out.println(".valueOf.ordinal(): " + Week.valueOf("MONDAY").ordinal());

        // .values() используется только если энам преобразовать в массив. При чем для распечатки каждого элемента
        // нужно указывать его индекс
        Week[] array = Week.values();
        System.out.println("Распечатать элемент по индексу 0: " + array[0]);







    }
}
