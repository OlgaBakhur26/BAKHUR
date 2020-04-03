package com.company;

public class CalcWithOperators implements ICalc{

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
        double res = 1;
        for (double i = 0; i < power; i++) {
            res = res * base;
        }
        return res;
    }

    public double module (double a) {
        if (a >= 0)
            return a;
        else
            return - a;
    }
}