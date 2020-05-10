package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Mainn7 {
    public static void main(String[] args) {
        DataContainer<String> dataContainer = new DataContainer(10);
        dataContainer.add("Hello world");
        dataContainer.add("Hello Denis");
        dataContainer.add("Hello kkgi");
        dataContainer.add("Hello ugujg");
        dataContainer.add("Hello jyvfs");
        dataContainer.add("Hello uyrfutgh");


        System.out.println(Arrays.toString(dataContainer.getData()));

    }
}
