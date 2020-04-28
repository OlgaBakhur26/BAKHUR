package com.company;

public class MultipleCatch {
    //Продемонстрировать применение
    //// нескольких операторов catch

    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/ a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e){ //По завершении одного из операторов catch все остальные
            // пропускаются, и выполнение программы продолжается с оператора, следующего сразу за блоком
            // операторов try/catch.
            System.out.println("division by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("шибка индексации за пределами массива: " + e); // не дойдет
        }
        System.out.println("После блока операторов try / catch");
    }



}
