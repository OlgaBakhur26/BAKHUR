package com.company;

public class CalcWithCounter_Main {


    public static void main(String[] args) {
        CalcWithMath calc1 = new CalcWithMath();
        CalcWithCounter calc2 = new CalcWithCounter(calc1);

        System.out.println(calc2.power(3, 4));
        System.out.println(calc2.getCounter());

        System.out.println(calc1.module(- 4));
        System.out.println(calc1.getCounter());

//        public static double getTotalCounter(){
//            return (CalcWithCounter.getCounter(calc2)) + (CalcWithMath.getCounter());
//        }

    }
}
