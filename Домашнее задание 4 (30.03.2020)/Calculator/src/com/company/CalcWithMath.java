package com.company;

public class CalcWithMath implements ICalc{

    private double counter = 0;

    public double adding(double x, double y) {
        this.counter++;
        return x + y;
    }

    public double subtraction (double x, double y) {
        this.counter++;
        return x - y;
    }

    public double division (double x, double y){
        this.counter++;
        return x / y;
    }

    public double multiplication (double x, double y){
        this.counter++;
        return x * y;
    }

    public double power (double base, double power) {
        this.counter++;
        return Math.pow(base, power);
    }

    public double module (double a) {
        this.counter++;
        return Math.abs(a);
    }

    public double getCounter(){
        return this.counter;
    }
}
