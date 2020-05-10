package com.company;

public class CallMe {
    void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    // синхронизированные вызовы метода call()
    public void run(){
        synchronized (target){
            // синхронизированный блок
            target.call(msg);
        }
    }
}

class Synch{
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронированный");
        Caller ob3 = new Caller(target, "мир");

        // ожидать завершения потока исполнения
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Прервано");
        }
    }
}
