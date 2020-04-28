package com.company.PublicPrivate;

public class Test {

    int a, b;

    // Это конструктор для создания объектов класса Test.
    // Называется просто одинаково с классом
    Test (int i, int j) {
        a = i;
        b = j;
    }

    // А это метод для сравнения созданных объектов
    // Возвратить логическое значение true, если в качестве параметра О указан
    // вызывающий объект.
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

}
