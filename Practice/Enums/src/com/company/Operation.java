package com.company;


// можно для каждой константы создать отдельные методы
public enum Operation {
    SUM {
        public int method(int x, int y){
            return x + y;
        }
    },
    SUBSTRACT {
        public int method(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY{
        public int method( int x, int y){
            return x * y;
        }
    };
    public abstract int method(int x, int y);

    }
