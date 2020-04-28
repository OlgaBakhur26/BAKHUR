package com.company.OverLoadDemo2;

public class StaticDemo {

    static  int a = 42;
    static int b = 99;

    static void callme () {
        System.out.println("a = " + a);
    }
}

// Чтоб вызвать метод к объекту: obj.method
// Чтоб вызвать метод без объекта: className.method
// Чтоб вызвать статическую переменную: className.variable
