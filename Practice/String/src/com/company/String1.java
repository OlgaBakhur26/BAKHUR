package com.company;

public class String1 {

    public static void main(String[] args) {
	// Создание объекта String
        String myString1 = "Это объект класса String";
        String myString2 = "И это тоже новый объект класса String";
        String myString3 = "Попродуем " + "создать объект " + "из склеенных " + "строк";
        String myString4 = myString1 + myString2;

        System.out.println(myString1);
        System.out.println(myString1 + " " + myString2); // две строки можно складывать (склеивать) in println
        // или запомнить их в переменную класса String и пользоваться ею дальше, как в String4.
        System.out.println(myString3);
        System.out.println(myString4);
    }
}
