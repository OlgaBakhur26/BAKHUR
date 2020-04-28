package com.company;

public class Stats<T extends Number> {
    // Класс Stats - пример безуспешой попытки создать
    // обобщенный класс для вычисления среднего значения
    //массива чисел заданного типа.
    //Этот класс содержит ошибку!

    T[]nums; //nums - массив класса NumЬer или его подкласса

    //передать конструктору ссылку на массив значений типа Т
    Stats(T[] o){
        nums = o;
    }

    //возвратить значение типа douЫe в любом случае
    double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue(); // Error!!!. Его исправляет extends Number

        } return sum / nums.length;
    }

    // Применение метасимволов подстановки в качестве аргументов (WildcardD)
    // Определить равенство двух средних значений.
    ////Обратите внимание на применение метасимвола постановки
    boolean sameAvg(Stats<?> ob){
        if(average() == ob.average())
            return true;
        else
            return false;
    }


}
