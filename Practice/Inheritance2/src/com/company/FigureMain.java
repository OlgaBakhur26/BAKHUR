package com.company;

public class FigureMain {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Площадь прямоугольника равна: " + figref.area());

        figref = t;
        System.out.println("Площадь треугольника равна: " + figref.area());

        figref = f;
        System.out.println("Площадь фигуры равна: " + figref.area());

    }
}
