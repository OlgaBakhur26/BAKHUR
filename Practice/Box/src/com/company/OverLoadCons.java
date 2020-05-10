package com.company;

public class OverLoadCons {
    public static void main(String[] args) {
        // Create boxes with all variants of constructors
        Box firstBox = new Box (10, 20, 15);
        Box secondBox = new Box ();
        Box cube = new Box (7);

        double vol;

        // Volume 1
        vol = firstBox.volume();
        System.out.println("Volume 1 is: " + vol);

        // Volume 2
        vol = secondBox.volume();
        System.out.println("Volume 2 is: " + vol);

        // Volume 3
        vol = cube.volume();
        System.out.println("Volume of cube is: " + vol);
    }
}
