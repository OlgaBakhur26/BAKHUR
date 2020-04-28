package com.company;

// Создать второй поток исполнения
public class NewThread_2 extends Thread{

    NewThread_2(){
        // создаем новый второй поток
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); // запускаем поток исполнения
    }

    // Точка входа во второй поток исполнения
    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочений поток завершен");
    }
}

class ExtendThread{
    public static void main(String[] args) {
        new NewThread(); // создать новый поток

        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
