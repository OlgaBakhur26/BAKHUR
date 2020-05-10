package com.company;

import java.sql.PreparedStatement;

public class ExceptionMain {

    public static void main(String[] args) {
        System.out.println(method1(10));
        System.out.println(method1(0));
        System.out.println(method1(130));

    }

    public static int method1(int i){
        try{
            System.out.println("Привет");
            int result = method2(i);
            System.out.println("Пока");
            return result;
        }catch (IllegalArgumentException | NullPointerException e){
            System.out.println("Возникла 1ая ошибка :(");
            throw new IllegalArgumentException("Там возможно 0 или null" + e);
        }
        catch (Throwable e){ // соблюдать порядок наследования
            System.out.println("Возникла 2ая ошибка :(");
        }
        return 0;
    }

    public static int method2(int i){
        return method3(i);
    }

    public static int method3(int i){
        if(i == 0){
            throw new RuntimeException("Нельзя вводить ноль");
        }
        return i;
    }



}
