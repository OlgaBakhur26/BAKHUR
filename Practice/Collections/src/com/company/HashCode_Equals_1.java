package com.company;

import java.util.*;

public class HashCode_Equals_1 {
    public static void main(String[] args) {

// Создадим Map и Set
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

// Создадим 2 экземпляра класса Person
        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(2, "Katy");
        Person person3 = new Person(2, "Tom");
        Person person4 = new Person(2, "Katy"); // у нас 2 разных объекта класса Person,
                                                           // но у них одинаковые поля.

// Добавим эти объекты в Map
        map.put(person1, "123"); // добавили объект (уже со своими двумя параметрами) в качестве ключа
        map.put(person2, "124"); // и примитив в качестве значения.
        map.put(person3, "125");


// Добавим эти объекты в Set
        set.add(person1);
        set.add(person2);
        set.add(person3);

// Вывести на экран Map и Set
        System.out.println(map); // по идее в Map не может быть 2 одинаковых ключа, а в Set 2 одинаковых элемента.
        System.out.println(set); // но они все же добавились и распечатались. Это потому, что методы hashCode и equals
        // берутся из класса Object, так как они не были переопределены для классов Set и Map. Если переопределить,
        // то все будет работать корректно.

// Для обратного примера создадим Set и Map строк
        Set<String> set2 = new HashSet<>();

//Добавим в Set строки
        set2.add("Hello");
        set2.add("Hello");

// Распечатаем Set с двумя одинаковыми строковыми элементами
        System.out.println(set2); // распечатался только один элемент. Работает правильно
    }

}

class Person{
    private int id;
    private String name;

// Создали конструктор класса Person
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

// Переопределили метод .toString для класса Person
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
