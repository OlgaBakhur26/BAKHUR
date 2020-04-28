package com.company;

import java.util.ArrayList;
import java.util.List;

public class User3Main {
    public static void main(String[] args) {

       User3 me = new User3();
       me.setFirstName3("Olga");
       me.setLastName3("Bakhur");

        User3 you = new User3();
        you.setFirstName3("Mary"); // убрать пробелы и привести к нижнему регистру
        you.setLastName3("Cat");

        List<User3> users = new ArrayList<User3>(); // создали лист юзеров
        users.add(you); // добавили одного юзера в Лист
        users.add(me); // добавили второго юзера в Лист

        System.out.println(users.get(0).getFullName());
        System.out.println(users.get(1).getFullName());







    }
}
