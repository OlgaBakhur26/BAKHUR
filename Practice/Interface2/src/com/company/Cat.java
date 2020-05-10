package com.company;

public class Cat implements Animal {


    @Override
    public void talk() {
        System.out.println("Meaw");
    }

    @Override
    public void run() {
        System.out.println("I can run");
    }

    // В классах, реализующих интерфейс могут объявляться собственные переменные и методы
    public String jump(){
        return "I can jump";
    }

    int age = 5;

}
