package com.company;

public class Dog implements Animal {
    @Override
    public void talk() {
        System.out.println("Woof");
        System.out.println("И еще я умею рычать");
    }

    @Override
    public void run() {
        System.out.println("I can run");
    }


}
