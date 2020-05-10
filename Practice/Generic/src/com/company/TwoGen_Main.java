package com.company;

public class TwoGen_Main {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщения");

        // Показать типы
        tgObj.showTypes();

        // Получить и показать значения
        int v = tgObj.getOb1();
        System.out.println("Значение 1: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение 2: " + str);


    }
}
