package com.company;

public class Teacher extends User implements ITalk {

    @Override
    public void sayHello() {
        System.out.println("Implemented");
    }
}
