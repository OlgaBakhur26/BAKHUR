package com.company.PublicPrivate;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test ();

        // Эти операторы правильты, поэтому члены a и b доступны непосредственно.
        ob.a = 10;
        ob.b = 20;

        // Жтот оператор не верен и может вызвать ошибку.
        // (c - private и доступен только из его класса).
       // ob.c = 100; // Ошибка

        // Доступ к члену из данного класса должен осуществляться
        // с помощью методов его класса.
        ob.setc(100); // Верно
        System.out.println("a, b, c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
