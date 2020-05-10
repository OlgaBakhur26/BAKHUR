package com.company;

public class Gen_Main {

    public static void main(String[] args) {

        //Создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;

        //Создать объект типа Gen<Integer> и присвоить
        // ссылку на него переменной iOb. Обратите внимание на
        //применение автоупаковки для инкапсуляции значения 88
        //11 в объекте типа Integer
        iOb = new Gen<Integer>(88); //autoboxing

        //показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        //получить значение переменной iOb. Обратите
// внимание на то, что для этого не требуется
//никакого приведения типов
        int v = iOb.getob(); //unboxing
        System.out.println("Значение v: " + v);
        System.out.println();

        // создать объект типа Gen1 для символьных строк
        Gen<String> strObj = new Gen<String>("Текст обобщений");

        // показать тип данных, хранящихся в переменной strOb
        strObj.showType();

        //получить значение переменной strOb. И в этом
// случае приведение типов не требуется
        String str = strObj.getob();
        System.out.println("Значение str: " + str);



    }
}
