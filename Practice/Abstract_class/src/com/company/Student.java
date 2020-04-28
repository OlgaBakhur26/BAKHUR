package com.company;

public class Student extends User {
    public boolean verified = true;
    public String major;


    public Student(){
        System.out.println("Creating a student"); // default Constructor.
        //while creating a student we will see this sout phrase.
    }

    public Student(String firstName, String lastName){
        System.out.println("Это новый студент, сделанный через конструктор");
        firstName = firstName;
        lastName = lastName;

    }

  // Реализация абстрактного метода из класса родителя. Оверрайд
    @Override
    public void sayHello(){
        System.out.println("Hi! My major is " + major + ". My name is " + firstName + " " + lastName);
    }

    @Override
    public void sayMeaw(){
        super.sayMeaw();
        System.out.println("Student version: meaw.");
    }


}
