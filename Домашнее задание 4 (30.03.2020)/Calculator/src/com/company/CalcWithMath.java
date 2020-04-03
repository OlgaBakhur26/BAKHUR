package com.company;

public class CalcWithMath implements ICalc{
    public double adding(double x, double y) {
        return x + y;
    }

    public double subtraction (double x, double y) {
        return x - y;
    }

    public double division (double x, double y){
        return x / y;
    }


    public double multiplication (double x, double y){
        return x * y;
    }

    public double power (double base, double power) {
        return Math.pow(base, power);
    }

    public double module (double a) {
        return Math.abs(a);
    }
}
