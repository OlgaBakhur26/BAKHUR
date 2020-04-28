package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.firstName = "Olga"; // Нет в классе Student, но оно наследуется из класса User
        s.lastName = "Bakhur"; // Нет в классе Student, но оно наследуется из класса User
        s.major = "Law"; // Специфическое поле, которое есть только в классе Student

        System.out.println(s.firstName);
        System.out.println(s.lastName);
        System.out.println(s.major);

        s.sayHello();



    }
}
