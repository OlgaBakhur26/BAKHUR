package com.company;

public class ThreeThreads implements Runnable {

    String name;
    Thread t;

    ThreeThreads(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // запустить поток на исполнение
    }

    // Точка входа в поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}

class MultiThreadDemo{
    public static void main(String[] args) {
        new ThreeThreads("Один"); // апустить потоки на исполнение
        new ThreeThreads("Два");
        new ThreeThreads("Три");


    try{
        // ожидать завершения других потоков исполнения
        Thread.sleep(10000);
        } catch (InterruptedException e){
        System.out.println("Главный поток прерван");
    }
        System.out.println("Главный поток завершен");
    }
}