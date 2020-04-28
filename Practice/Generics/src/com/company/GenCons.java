package com.company;

class GenCons {
    private double val;
    <T extends Number> GenCons(T arg){
        val = arg.doubleValue(); // когда в переменную типа double пытаемся записать интовое значение -
        // все ок. Это автоматическое приведение типов. Но наоборот нельзя надо приводить дабл к инту вручную
    }

    void shawVal(){
        System.out.println("val: " + val);
        }
}

class GenConsDemo{
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test.shawVal();
        test2.shawVal();
    }
}

