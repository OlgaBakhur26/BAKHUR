package com.company;

public interface Animal {
    int paw = 4; // неявно объявлены как public, statiс, final
    int tail = 1;

    public void talk(); // метод в интерфейсе д.б. всегда public. По существу - это абстрактный метод.
                        // Нет тела метода.
    public void run();

    default void whoAmI(){
        System.out.println("I'm an animal"); // дефолтный метод с телом в интерфейсе
    }


}
