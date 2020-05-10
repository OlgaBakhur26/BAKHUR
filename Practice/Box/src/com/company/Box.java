package com.company;

public class Box {

    double height;
    double width;
    double depth;

    // Конструктор для класса Box
    Box (double height, double width, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Конструктор для класса Box без параметров
    Box () {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор для создания куба
    Box (double len) {
        width = height = depth = len;
    }

    // Метод, чтобы посчитать и возвратить объем
    double volume () {
        return height * width * depth;
    }

}
