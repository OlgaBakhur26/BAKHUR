package com.company;

import java.util.ArrayList;
import java.util.List;

public class User6Main {
    public static void main(String[] args) {

        User6 me = new User6();
        me.setFirstName6("Olga");
        me.setLastName6("Bakhur");

        User6 you = new User6();
        you.setFirstName6("Mary");
        you.setLastName6("Cat");

        List<User6> users = new ArrayList<>();
        users.add(me);
        users.add(you);

        User6.printUsers(users);

//        System.out.println(User6.searchList(users, "Marry", "Cat"));

        System.out.println(me.toString());

    }
}
