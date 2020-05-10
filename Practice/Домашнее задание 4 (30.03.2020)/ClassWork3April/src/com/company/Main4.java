package com.company;

public class Main4 {
    public static void main(String[] args) {

        // Из одного класса можно делать методы с разными типами
        BoxGeneric<Integer> box = new BoxGeneric();
        box.setItem(123);
      //  box.setItem("123");

        BoxGeneric<String> box2 = new BoxGeneric<>();
     //   box2.setItem(123);
        box2.setItem("123");
    }
}
