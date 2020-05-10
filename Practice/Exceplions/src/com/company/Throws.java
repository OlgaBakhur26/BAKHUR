package com.company;

public class Throws {
    // Эта программа содержит ошибку, и поэтому она не подлежит компиляции

//    static void throwOne(){
//        System.out.println("В теле метода throwOne()");
//        throw new IllegalAccessException("демонстрация");
//        }
//
//    public static void main(String[] args) {
//        throwOne();
//    }
    // Чтобы эту программу можно было скомпилировать, в ее исходный код следует
    //внести два изменения. Во-первых, объявить в методе throwOne () генерирование
    //исключения типа IllegalAccessException. И, во-вторых, определить в методе
    //main () блок оператора try / catch для перехвата этого исключения. Ниже
    //приведен исправленный код данной программы.

    static void throwOne() throws IllegalAccessException{
        System.out.println("В теле метода throwOne()");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        } catch (IllegalAccessException e){
            System.out.println("Перехвачено исключение: " + e);
        }
    }


}
