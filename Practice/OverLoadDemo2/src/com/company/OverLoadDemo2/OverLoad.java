package com.company.PublicPrivate;

public class OverLoad {
    public static void main(String[] args) {

        OverLoadDemo2 ob = new OverLoadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);



    }
}