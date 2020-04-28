package com.company;

public class Rectangle extends Figure {
    // Переопреопределить конструктор для четырехугольника
    Rectangle(double a, double b) {
        super(a, b);
    }

    // Переопреопределить метод area для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
