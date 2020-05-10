package com.company;

public class BoxA {
    // создать 2 ящика
            public static void main(String[] args) {

            Box firstBox = new Box(7, 5, 3);
            Box secondBox = new Box (8, 5, 7);

            double vol;

            vol = firstBox.volume();
            System.out.println("Volume first:" + vol);

            vol = secondBox.volume();
            System.out.println("Volume second: " + vol);



        }
}
