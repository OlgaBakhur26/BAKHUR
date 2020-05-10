package com.company;

public class User {
    public String firstName;
    public String lastName;
    public boolean verified = false;

    // Создаем метод в главном классе, чтоб он потом работал в наследнике
    public void sayHello(){
        System.out.println("Hi! I'm a user. My name is " + firstName + " " + lastName);
    }
}
