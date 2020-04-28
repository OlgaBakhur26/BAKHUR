package com.company;

public class Gen<T> {
    T ob; // объявление объекта типа T

    // Передать конструкторц ссылку на объект типа T
     Gen(T o){
        ob = o;
     }
    // Возвратить объект ob
    T getob(){
        return ob;
    }

    // показать тип Т
    void showType() {
        System.out.println("Типом Т является: " + ob.getClass().getName());
    }
}
