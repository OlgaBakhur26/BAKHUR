package com.company;

public abstract class Turtle implements Animal {
    // Частичные реализации
    //Если класс включает в себя интерфейс, но не полностью реализует определенные
    //в нем методы, он должен быть объявлен как abstract.
    // Здесь нет метода Run().
    // В абстрактном классе могут быть и конкретные методы


    @Override
    public void talk() {
        System.out.println("I talk very quietly");
    }
}
