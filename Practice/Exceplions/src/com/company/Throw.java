package com.company;

public class Throw {
    // Продемонстрировать применение оператора throw
    static void demoProc(){
        try{
            throw new NullPointerException("Демонстрация");
            }catch (NullPointerException e){
            System.out.println("Исключение перехвачено в теле метода demoProc().");
            throw e; // повторно сгенерировать исключение
        }
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }catch (NullPointerException e){
            System.out.println("Повторный перехват: " + e);
        }
    }
}
