package com.company;

public class Main {

    public static void main(String[] args) {

        Thread t = Thread.currentThread(); // ссылка на текущий поток исполнения сохраняется в локальной переменной t.
        System.out.println("Текущий поток: " + t);

        // Изменить имя потока
        t.setName("My Thread");
        System.out.println("После изменения имени потока: "+ t);

        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); // выводятся цифры в обратном порядке с задержкой на 1 секунду
                                          // после каждой строки. Пауза организуется с помощью метода sleep ().
                                          // Аргумент метода s 1 еер ( ) задает время задержки в миллисекундах.
                }
        }catch (InterruptedException e){
            System.out.println("Главный поток исполнения прерван"); //Thread[My Thread,5,main] - Этот метод
            // выводит по порядку имя потока исполнения, его приоритет и имя его группы.


// установить имя потока исполнения можно с помощью метода setName ().А для того чтобы получить
//имя потока исполнения, достаточно вызвать метод getName ()
            System.out.println(t.getName()); // не печатает в консоль.Хз почему
        }
    }
}
