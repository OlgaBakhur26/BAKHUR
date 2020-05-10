package com.company;

public class TwoGen_Main {
    public static void main(String[] args) {

        TwoGen<Integer, String> twoGenObj = new TwoGen<Integer, String>(77, "Обобщенный текст");


        twoGenObj.showTypes();

        int value = twoGenObj.getOb1();
        System.out.println("Значение twoGenObj.getOb1():    " + value);

        String value2 = twoGenObj.getOb2();
        System.out.println("Значение twoGenObj.getOb2():    " + value2);


    }
}
