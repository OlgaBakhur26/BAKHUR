package com.company;

public class Student extends User {
    public boolean verified = true;
    public String major;

    @Override
    public void sayHello(){
        System.out.println("Hi! My major is " + major + ". My name is " + firstName + " " + lastName);
    }


}
