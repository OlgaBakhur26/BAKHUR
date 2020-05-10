package com.company;

public class Boolean1Main {
    public static void main(String[] args) {
        Boolean1 person1 = new Boolean1();
        Boolean1 person2 = new Boolean1();

        person1.setName("Olga");
        person1.setSurName("Bakhur");

        person2.setName("Mary");
        person2.setSurName("Cat");

        System.out.println(person1.output());
        System.out.println(person1.output(true));
        System.out.println(person2.output(false));





    }
}
