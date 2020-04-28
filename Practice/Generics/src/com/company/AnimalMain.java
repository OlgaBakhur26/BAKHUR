package com.company;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        test(listOfAnimal);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        test(listOfDogs);

    }

    private static void test(List<? extends Animal> list){
        for (Animal animal: list){
            System.out.println(animal);
        }

    }

}


