package com.company;

// Применить метод join(), чтобы ожидать завершения потоков исполнения

public class JoinThread implements Runnable {

    String name; // имя потока исполнения
    Thread t;

    JoinThread(String threadName){
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

class JoinDemo{
    public static void main(String[] args) {
        JoinThread ob1 = new JoinThread("Один"); // апустить потоки на исполнение
        JoinThread ob2 = new JoinThread("Два");
        JoinThread ob3 = new JoinThread("Три");

        System.out.println("Приоритет ob1: " + ob1.t.getPriority());
        System.out.println("Приоритет ob2: " + ob2.t.getPriority());
        System.out.println("Приоритет ob3: " + ob3.t.getPriority());

        ob1.t.setPriority(1);
        ob2.t.setPriority(5);
        ob3.t.setPriority(10);

        System.out.println("Приоритет ob1: " + ob1.t.getPriority());
        System.out.println("Приоритет ob2: " + ob2.t.getPriority());
        System.out.println("Приоритет ob3: " + ob3.t.getPriority());

        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob2.t.isAlive());

        // ожидать завершения потоков исполнения

        try{
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob2.t.isAlive());
        System.out.println("Главный поток завершен");
    }
}