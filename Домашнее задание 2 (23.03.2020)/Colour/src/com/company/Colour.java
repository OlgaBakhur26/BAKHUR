package com.company;

public class Colour {

    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int VIOLET = 7;
    private int colourNumber;


    public Colour (int i) {
        this.colourNumber = i;
        }

    public int getColourNumber() {
        return colourNumber;
    }

    String colourName () {
        switch (this.colourNumber) {
            case RED:
                return "Красный";
            case ORANGE:
                return "Оранжевый";
            case YELLOW:
                return "Желтый";
            case GREEN:
                return "Зеленый";
            case BLUE:
                return "Голубой";
            case INDIGO:
                return "Синий";
            case VIOLET:
                return "Фиолетовый";
            default:
                return "Цвет неизвестен";
        }
    }
}



