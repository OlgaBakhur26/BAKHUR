package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
// Имеет все те же методы, что и ArratList
        linkedList.add(1);
        linkedList.get(0);
        linkedList.size();
        linkedList.remove(0);

// Создадим новый экземпляр класса ArrayList
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);

        System.out.println(arrayList); // поскольку все последующие элементы по возрастанию
        // всегда ставили на позицию 0, то массив получился в обратном порядке

    }

// Создадим метод, который будет измерять время работы разных операций на ArrayList и на LinkedList
private static void measureTime(List<Integer> list){

//    for (int i = 0; i < 1_000_000; i++) { // добавляет элементы в конец листа
//        list.add(i); // ArrayList быстрее в 2 раза при добавлении
//    }

//    for (int i = 0; i < 100_000; i++) {
//        list.get(i); // ArrayList быстрее в тысячи раз при чтении
//    }

    long strat = System.currentTimeMillis();

    for (int i = 0; i < 100_000; i++) {
        list.add(0, i); // добавляет элемент на определенный индекс
        // тут ArrayList в сотни раз медленнее, потому что в нем внутри массив, а в LinkedList цепочка из
        // узлов, которые с помощью ссылок указывают на следующий. А в самом начале есть головной узел. Ему нужно
        // присвоить ссылку на новый объект на позиции ноль, а этому объекту ссылку на старый объект на позиции нол.
        // теперь этот старый объект уже на позиции 1. Поэтому Arraylist хорош при добавлении в конец и при простом чтении,
        // а при добавлении в начало и середину, и при удалении хорош LinkedList
    }

        long end = System.currentTimeMillis();
    System.out.println(end - strat);
}


}
