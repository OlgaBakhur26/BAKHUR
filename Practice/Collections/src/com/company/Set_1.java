package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_1 {
    public static void main(String[] args) {

// Set как и List хранит в себе одиночные элементы, в отличие от Map (там пары). В Set только уникальные элементы
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

// 1. Положить элементы в hashSet
        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");

// Извлечь элементы из hashSet через цикл for each
        for (String name : hashSet){
              System.out.println(name); //  не сохраняет порядок добавления
        }
        System.out.println();

// 2. Положить элементы в LinkedHashSet
        linkedHashSet.add("Mike2");
        linkedHashSet.add("Katy2");
        linkedHashSet.add("Tom2");
        linkedHashSet.add("George2");
        linkedHashSet.add("Donald2");

// Извлечь элементы из linkedHashSet через цикл for each
        for (String name : linkedHashSet){
            System.out.println(name); //  в порядке добавления
        }
        System.out.println();

// 3. Положить элементы в treeSet
        treeSet.add("Z3");
        treeSet.add("А3"); // русский после английского
        treeSet.add("Mike3");
        treeSet.add("Katy3");
        treeSet.add("Tom3");
        treeSet.add("George3");
        treeSet.add("Donald3");

// Извлечь элементы из treeSet через цикл for each
        for (String name : treeSet){
            System.out.println(name); //  отсортировано по алфавиту
        }
        System.out.println();


// Метод contains(). Если есть такой элемент, то вернется true. Быстрее работает, чем в Дшые
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Z3"));
        System.out.println(treeSet.contains("Z3"));
        System.out.println();

// Метод .isEmpty. Возвращает true, если Set пустой
        System.out.println(hashSet.isEmpty());

// Обработка дубликатов. Положим в hashSet еще несколько раз то же имя
        hashSet.add("Mike");
        hashSet.add("Mike");
        hashSet.add("Mike");

        for (String name : hashSet){
            System.out.println(name); //  имя Mike было выведено только 1 раз
        }
        System.out.println();

// Union - объединение множеств
    Set<Integer> set1 = new HashSet<>();
    set1.add(0);
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    set1.add(5);

    Set<Integer> set2 = new HashSet<>();
    set2.add(2);
    set2.add(3);
    set2.add(4);
    set2.add(5);
    set2.add(6);
    set2.add(7);

    Set<Integer> union = new HashSet<>(set1);
    union.addAll(set2); // в первый сет добавились недостающие элементы из второго сета
           System.out.println(union); // [0, 1, 2, 3, 4, 5, 6, 7]

// intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // в первом сете остаются только те элементы, которые есть в сете 2
        System.out.println(intersection); // [2, 3, 4, 5]

// difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2); // из первого сета удаляются все элементы, которые есть в сете 2
        System.out.println(difference); // [0, 1]



    }
}
