package com.company;

public class Book {

    // Объявляем переменные класса Book
    String name;
    String author;
    Type type;

    // Создаем конструктор для объекта класса Book
    public Book (String name, String author, Type type){
        this.type = type;
        this.name = name;
        this.author = author;

    }
}
