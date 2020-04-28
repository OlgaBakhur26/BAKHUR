package com.company;

public class TwoGen<T, V> { //Простой обобщенный класс с двумя параметрами типа: Т и V
    T ob1;
    V ob2;

    // передать конструктору ссылки на объекты типа т и V
    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    // показать типы Т и V
    void showTypes(){
        System.out.println("Объект Т: " + ob1.getClass().getName());
        System.out.println("Объект V: " + ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }




}
