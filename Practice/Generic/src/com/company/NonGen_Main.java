package com.company;

public class NonGen_Main {
    public static void main(String[] args) {

        NonGen iOb;

        // создать объект типа NonGenи сохранить в нем
        // объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(88);

        // показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // получить значение переменной iOb,
        //на этот раз требуется приведение типов
        int v = (Integer) iOb.getob();
        System.out.println("Значение v: " + v);
        System.out.println();

        //создать другой объект типа NonGen и
        //сохранить в нем объект типа String
        NonGen strOb = new NonGen("Текст без обобщений");

        //показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        //получить значение переменной strOb,
        //и в этом случае потребуется приведение типов
        String str = (String) strOb.getob();
        System.out.println("Значение str: " + str);

        //Этот код компилируется, но
        //он принципиально неверный!
        iOb = strOb;
        v = (Integer) iOb.getob();







    }
}
