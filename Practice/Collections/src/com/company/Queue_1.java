package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue_1 {
    public static void main(String[] args) {
       // Создаем объекты
        People person1 = new People(1);
        People person2 = new People(2);
        People person3 = new People(3);
        People person4 = new People(4);
// Создаем очередь и добавляем в нее созданные объекты
        Queue<People> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);
// Распечатываем очередь
        for (People person : people) {
            System.out.println(person); // в порядке добавления (first in, first out)
        }
// Итог:
        // People{id=3}
        //People{id=2}
        //People{id=4}
        //People{id=1}
        System.out.println();


// ArrayBlockingQueue - другой класс, который тоже реализовывает интерфейс Queue
        Queue<People> people2 = new ArrayBlockingQueue<>(10); // обязательно надо указывать максимальный размер очереди
        people2.add(person3);
        people2.add(person2);
        people2.add(person4);
        people2.add(person1);
// Метод .remove() удаляет первый элемент в очереди. Это странно,
        System.out.println(people2.remove()); // достали и удалили элемент
        // но он распечатывается - People{id=3}
        System.out.println(people2); // Тут распечатывается список без удаленного элемента -
        // [People{id=2}, People{id=4}, People{id=1}]
        System.out.println();

// Метод .peek() не удаляет элемент. Просто достает его и показывает ( как .get)
        System.out.println(people2.peek()); // People{id=2}
        System.out.println(people2); // остался в очереди - [People{id=2}, People{id=4}, People{id=1}]

// Разница между .add() и .offer()
        Queue<People> people3 = new ArrayBlockingQueue<>(3);
// С помощью метода  .add()  попробуем добавить 4 элемента в очередь, максимальный размер которой 3.
        System.out.println("Add");
        people3.add(person3);
        people3.add(person2);
        people3.add(person4);
//        people3.add(person1);
        System.out.println(people3);
// Выбрасывает IllegalStateException: Queue full

// Теперь попробуем сделать то же самое с помощью метода .offer()
        System.out.println("Offer");
        people3.offer(person3);
        people3.offer(person2);
        people3.offer(person4);
        people3.offer(person1);
        System.out.println(people3);
// Итог: исключение не выбрасывает. Просто не добавляет невлезающий элемент

// Та же логика работает и с парами методов
// .remove() / .poll()
// .element() / .peek()





    }



}

class People{
    private int id;

    public People(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                '}';
    }
}
