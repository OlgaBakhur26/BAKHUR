package com.company;

public class CalculatorWithOperators {

    double addition (double a, double b) {
        double res = a + b;
        return res;
        }

    double subtraction (double a, double b) {
        double res = a - b;
        return res;
    }

    double multiplication (double a, double b) {
        double res = a * b;
        return res;
    }

    double devision (double a, double b) {
        double res = a / b;
        return res;
    }

    double power(double a, double b){
        double res = 1;
        for (double i = 1; i <= b; i++){
            res = res * a;
        }
        return res;
    }

    double module (double a) {
        if (a >= 0)
            return a;
        else
            return - a;
    }


}
