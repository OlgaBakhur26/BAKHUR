package com.company;

public class Colour2 {
    public static void main(String[] args) {
        Colour sample = new Colour (3);

        sample.getColourNumber ();
        System.out.println("Номер цвета: " + sample.getColourNumber());

        sample.colourName();
        System.out.println("Название цвета: " + sample.colourName());
    }
}
