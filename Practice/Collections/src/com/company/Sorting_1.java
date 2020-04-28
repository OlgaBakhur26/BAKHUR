package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_1 {
    public static void main(String[] args) {
// I.

// 1. Создаем List объектов класса String
        List<String> animals = new ArrayList<>();
// Добавляем животных в List
        animals.add("dog");
        animals.add("elephant");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("tiger");

// Сортируем лист методом Collections.sort()
        Collections.sort(animals);
// Распечатываем отсортированный List
        System.out.println(animals); // Отсортировалось по алфавиту (лексико-графический порядок (по умолчанию))
                                     // [bird, cat, dog, frog] - естественный порядок для объектов String

// 2. Создаем List объектов класса Integer
        List<Integer> numbers = new ArrayList<>();
// Добавляем цифры в List
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);
// Сортируем лист методом Collections.sort()
        Collections.sort(numbers);
// Распечатываем отсортированный List
        System.out.println(numbers); // Отсортировалось по возрастанию (по умолчанию)
                                     // [0, 5, 100, 500] - естественный порядок для объектов Integer

// II. Сравнение длин строк
        Collections.sort(animals, new String_Length_Comparator()); // в качестве первого аргумента преинмает
        // объект класса, реализу.щего интерфейс List, а в качестве второго аргумента - объект класса,
        // реализующего интерфейс Comparator (т.о. принимает 2 ОБЪЕКТА). Но сортирует не их, а элементы List -
        // элементы первого объекта. Второй объект Comparator здесь нужен для того, чтобы перетянуть метод compare.

        // Распечатать List, отсортированный по длине строк
        System.out.println(animals); // теперь лексико-графический порядок (по умолчанию) не работае

// III.
// Введем новый порядок сортировки для List Integer. По убыванию
        Collections.sort(numbers, new Backwards_Integer_Comparator());
        System.out.println(numbers); // [0, 5, 100, 500] ничего не изменилось. Отсортированы по возрастанию
// Сейчас метод compare выглфдит так:
/*
        public int compare(Integer o1, Integer o2) {
            if(o1 > o2){
                return 1;
            }else if(o1 < o2){
                return -1;
            } else{
                return 0;
            }
        }
 */
// для того, чтобы изменить и сделать по убыванию надо обратить знаки в перегруженном методе compare
// вот так:
/*
        public int compare(Integer o1, Integer o2) { // возвращается целое число (1, -1, 0)
            if(o1 < o2){
                return 1;
            }else if(o1 > o2){
                return -1;
            } else{
                return 0;
            }
        }
 */
        System.out.println(numbers); // [500, 100, 5, 0] - получилось по убыванию после обращения знаков

// IV.
// Собственное сравнение
// Создаем List объектов класса Persons
          List<Persons> people = new ArrayList<>();
          people.add(new Persons(2, "Bob")); // создаем и сразу добавляем объекты
          people.add(new Persons(3, "Katy"));
          people.add(new Persons(1, "Mike"));

// Сортируем объекты в листе
        //Collections.sort(people); // подчеркивает красным people потому что не задан естественный порядок
        // у String и Integer он задан по умолчанию, а в нашем собственном классе его нужно отдельно задавать
        Collections.sort(people, new Comparator<Persons>() { // Сортировка по Id
            @Override
            public int compare(Persons o1, Persons o2) { // мы не переопределяли метод в его классе Persons
                if(o1.getId() > o2.getId()){ // Вместо этого мы переопределили его тут в Main
                    return 1;                // это что-то связанносе с Анонимными слвссами
                } else if(o1.getId() < o2.getId()){
                    return -1;
                }else{
                    return 0;
                }

            }
        });
        System.out.println(people); // id выстроились в порядке возрастания
    }
}


// Но если нас не устраивает порядок сортировки по умолчанию, то можно задать свой порядок
// с помощью интерфейса Comparator. Для этого нужно создать новый класс и реализовать в нем Interface Comparator.

class String_Length_Comparator implements Comparator<String>{

    // II.
    // надо реализовать метод .compare() так, чтобы он сравнивал длины строк
    @Override
    public int compare(String o1, String o2) { // возвращается целое число (1, -1, 0)
        if(o1.length() > o2.length()){
            return 1;
        }else if(o1.length() < o2.length()) {
            return -1;
        } else{
            return 0;
        }
    }
}

class Backwards_Integer_Comparator implements Comparator<Integer>{
    // III.
    // Введем новый порядок сортировки для List Integer. По убыванию
    @Override
    public int compare(Integer o1, Integer o2) { // возвращается целое число (1, -1, 0)
        if(o1 < o2){
            return 1;
        }else if(o1 > o2){
            return -1;
        } else{
            return 0;
        }
    }
}

class Persons{

    // IV.
    // Собственное сравнение
    private int id;
    private String name;

    public Persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
