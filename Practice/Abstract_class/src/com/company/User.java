package com.company;

public abstract class User {
    private String firstName;
    private String lastName;
    public boolean verified = false;

    public User (String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

    // Создаем метод в главном классе, чтоб он потом работал в наследнике
    public abstract void sayHello(); // Если в абстрактном классе есть метод, то в классе наследнике
                                     // он должен быть обязательно реализован


     public void sayMeaw(){
         System.out.println("User version: Meaw");


     }
}