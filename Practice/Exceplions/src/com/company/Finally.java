package com.company;

public class Finally {
    // Оператор finally образует блок кода, который будет выполнен по завершении
    // блока операторов try/catch, но перед следующим за ним кодом.

    // сгенерировать исключение в методе
    static void procA(){
        try{
            System.out.println("B теле метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }
 // Возвратить управление из блока try
    static void procB(){
        try{
            System.out.println("B теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB()");
        }
    }
// выполнить блок try, как обычно
static void procC(){
    try{
        System.out.println("B теле метода procC()");
        } finally {
        System.out.println("Блок оператора finally в методе procC()");
    }
}

    public static void main(String[] args) {
        try{
            procA();
        }catch (Exception e){
            System.out.println("Исключение перехвачено");
        }

        procB();
        procC();
    }
}
