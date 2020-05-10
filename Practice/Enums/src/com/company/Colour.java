package com.company;

public enum Colour {
    // Тут константы уже объекты
    RED ("#FF000"),
    BLUE ("#000FF"),
    GREEN ("#00FF00");
    private String code; // это переменная для конструктора

    // Внутри enum создаем конструктор для его объектов
    Colour(String code){
        this.code = code;
    }

    // Внутри enum создаем метод, который получает значение private переменной
    public String getCode(){
        return code;
    }


}
