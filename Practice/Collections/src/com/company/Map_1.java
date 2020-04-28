package com.company;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
// Добавить пары ключ - значение
        map.put(1, "one"); // добавляем примитивы, но можно и объекты
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);

// Перезаписать значение на уже существующий ключ
        map.put(3, "Other value");
        System.out.println(map); // старое значение переписывается

// Получить значение по индексу методом .get()
        System.out.println(map.get(1));
        System.out.println(map.get(10)); // если такого ключа нет, то значение вернется null

// Пройтись по map через цикл for each
// Добавить пары ключ - значение
        Map<String, String> translation = new HashMap<>();
        translation.put("кошка", "cat");
        translation.put("собака", "dog");
        translation.put("слон", "elephant"); // в HashMap при распечатке порядок не сохраняется

        for(Map.Entry<String, String> entry : translation.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
