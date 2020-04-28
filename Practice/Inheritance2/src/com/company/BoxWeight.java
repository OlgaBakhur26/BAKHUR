package com.company;

import org.w3c.dom.ls.LSOutput;

public class BoxWeight extends Box {
    double weight;

    int example = 2;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }

   // Перекрытие одинковыми названиями переменных в двух классах (int example)
   void show(){
       System.out.println("Переменная example суперкласса: " + super.example);
       System.out.println("Переменная example ПОДкласса: " + example);
   }


}
