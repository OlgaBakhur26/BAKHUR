package com.company;

public class NonGen {
    //Класс NonGen - функциональный эквивалент
    //11 класса Gen без обобщений

    Object ob; //объект оЬ теперь имеет тип Object

    // передать конструктору ссылку на объект типа Object
    NonGen(Object o){
        ob = o;
    }

    // возвратить тип Object
    Object getob(){
        return ob;
    }

    // показать тип объекта оЬ
    void showType(){
        System.out.println("Type of object ob: " + ob.getClass().getName());
    }




}
