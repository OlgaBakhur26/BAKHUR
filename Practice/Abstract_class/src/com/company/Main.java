package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.firstName = "Olga"; // Нет в классе Student, но оно наследуется из класса User
        s.lastName = "Bakhur"; // Нет в классе Student, но оно наследуется из класса User
        s.major = "Law"; // Специфическое поле, которое есть только в классе Student

        System.out.println(s.firstName);
        System.out.println(s.lastName);
        System.out.println(s.major);

        //s.sayHello();

        // Abstract classes
        // User u = new User(); // Нельзя делать объекты из абстрактного класса
        // но можно делать экземпляры классов, наследуемых от него, например
        // Student s = new Student();

        // Polymorphism
        Teacher t = new Teacher();
        t.firstName = "Marry";
        t.lastName = "Cat";

        //Constructor
        Student z = new Student("Kot", "Begemot");
        System.out.println(z.lastName);

        List<User> users = new ArrayList<User>();
        users.add(s);
        users.add(t);
        users.add(z);

        for (User u: users){
            u.sayHello();
        }

        s.sayMeaw();




    }
}
