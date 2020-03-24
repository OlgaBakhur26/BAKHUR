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

// Тут не работает. Просит return statement. Я не понимаю, какой return, если во всех ветвях, где было нужно,
// я его указала? Что-то пошло не так на моменте с возведением в отрицательную степень.
    double power(double base, double power) {

        if (power > 0) {
            if (base == 0)
                return 0;
            else {
                double res = 1;
                for (double i = 1; i <= power; i++) {
                    res = res * base;
                }
                return res;
            }
        }


        else if (power == 0) {
            if (base != 0)
                return 1;
            else if (base == 0)
                return 0;
        }



        else if (power < 0) {
            double res = 1;
            for (double i = 1; i <= Math.abs(power); i++) {
                res = -(1 / (res * base));
            }
            return res;
        }
    }



    double module (double a) {
        if (a >= 0)
            return a;
        else
            return - a;
    }

    // Корня пока нет


}
