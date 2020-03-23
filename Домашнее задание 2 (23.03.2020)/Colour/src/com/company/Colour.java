package com.company;

// Я не знаю, как это решать.
// Переменными colourName и colourNumber нельзя назвать эти цвета, потому что они константы и не могут примиматьиных значений.
// через this в конструктор тоже ничего не передашь, потому что переменные final
// Я не понимаю, как при создании объекта класса Colour с параметром 3 метод get (или любой другой метод) должен узнать
// об этом и вывести какую-то информацию?
// Как через switch можно прогнать переменную colourName, которая должна обозначать цвета, если мы ее к цветам привязать
// не можем потому что они final?



public class Colour {

    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int VIOLET = 7;
    int colourName;


    public Colour (int i) {
        int colourNumber = i;
        System.out.println("Номер цвета:" + i);
        }


        public int getRED (){
        return RED;
    }

    public int getORANGE (){
        return ORANGE;
    }

    public int getYELLOW (){
        return YELLOW;
    }
    public int getGREEN (){
        return GREEN;
    }

    public int getBLUE (){
        return BLUE;
    }

    public int getINDIGO (){
        return INDIGO;
    }

    public int getVIOLET (){
        return VIOLET;
    }





    switch (colourName) {
        case RED:
            System.out.println("Красный");
            break;
        case ORANGE:
            System.out.println("Оранжевый");
            break;
        case YELLOW:
            System.out.println("Желтый");
            break;
        case GREEN:
            System.out.println("Зеленый");
        case BLUE:
            System.out.println("Голубой");
        case INDIGO:
            System.out.println("Синий");
        case VIOLET:
            System.out.println("Фиолетовый");
        default:
            System.out.println("Цвет неизвестен");
    }
}



