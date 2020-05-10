package com.company;

public class User {
    public String firstName; // field (variable). It is announced at the Class level,
    public String lastName; // but going to be defined at the local level - in method.

    public void output(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(firstName + " " + lastName);
        }
    }

    public String output2() {
        return "Hi, my name is " + firstName + " " + lastName;
    }
}
