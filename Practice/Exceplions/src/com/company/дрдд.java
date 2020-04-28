package com.company;

import java.util.Random;

class HandleError {
    public static void main(String args[]) {
        int а = 0, b = 0, с = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++)
            try {
                b = r.nextInt();
                с = r.nextInt();
                а = 12345 / (b / с);
            }
                catch(ArithmeticException e){
                    System.out.println("Исключение " + e);
                    а = 0; //присвоить нуль и продолжить работу
                    System.out.println("a: " + а);
                }
            }
    }