package com.company;

import java.util.Comparator;

public class Animal_Comporator extends Comparator<Animal> {



    @Override
    public int compare(Animal first, Animal second) {
        return Integer.compare(first.getAge(), second.getAge());
    }



}
