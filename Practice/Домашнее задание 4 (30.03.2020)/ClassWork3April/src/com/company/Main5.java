package com.company;

public class Main5 {
    public static void main(String[] args) {
        BoxGeneric<Integer> box = new BoxGeneric<>();
        box.setItem(123);

        BoxGeneric<String> box2 = new BoxGeneric<>();
        box2.setItem("123");

        BoxNumber<Number> box3 = new BoxNumber<>(); // можно передать любой часленный тип
        box3.setItem(6343d);

        Integer a = 123;
        Number b = 123;

//        a = b;
//        b = a;

  //      box = box3;





    }
}
