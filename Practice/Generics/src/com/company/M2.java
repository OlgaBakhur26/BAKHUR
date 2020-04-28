package com.company;

public class M2<T> extends M<T> {
    M2(T o){
        super(o);
    }
}

class Demo{
    public static void main(String[] args) {
        M <Integer> iob = new M<Integer>(100);
        M2 <Integer> iob2 = new M2<Integer>(200);
        M2 <String> strob2 = new M2<String>("Text");

        if (iob instanceof M<?>)
            System.out.println("instance");

        if (iob2 instanceof M2<?>)
            System.out.println("instance");

        if (strob2 instanceof M2<?>)
            System.out.println("instance");

        if (strob2 instanceof M<?>)
            System.out.println("instance");
        else
            System.out.println("not instance");

        if (iob instanceof M2<?>)
            System.out.println("instance");
        else
            System.out.println("not instance");
    }



}
