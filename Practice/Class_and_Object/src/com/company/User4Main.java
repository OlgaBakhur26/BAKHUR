package com.company;

import java.util.ArrayList;
import java.util.List;

public class User4Main {
    public static void main(String[] args) {

// Как добавить много юзеров из Листа
        String[] firstNames = {"Caleb", "Sub", "Sally", "Jamie"};
        String[] lastNames = {"Curry", "Scriber", "Smith", "Cal"};

        List<User4> users = new ArrayList<User4>(); // создали лист юзеров

        for (int i = 0; i < firstNames.length; i++) {
            User4 u = new User4();
            u.setFirstName4(firstNames[i]);
            u.setLastName4(lastNames[i]);
            users.add(u);
        }

        for (User4 u: users){
            System.out.println(u.getFullName());
        }










    }
}
