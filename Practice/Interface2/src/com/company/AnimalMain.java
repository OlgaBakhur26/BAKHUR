package com.company;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.talk();
        System.out.println(cat1.jump());
        System.out.println("My age is " + cat1.age);
        System.out.println("I have " + cat1.paw + " paws and " + Animal.tail + " tail.");
        // Из Мэйн метода можно получить доступ как к переменным класса через его экземпляр,
        // так и к переменным интерфейса, который имплементирует этот класс.
        // При чем на переменные интерфейса можно ссылаться как через объект класса,
        // так и через интерфейс непосредственно.

        // Можно создавать обекты со ссылкой (Тип) не на класс, а на интерфейс
        Animal cat2 = new Cat(); // Полиморфный кот. такому объекту будут доступны только методы интерфейса,
        cat2.talk();             // переопределенные в классе данного объекта,
                                 // но не те дополнительные, которые есть еще в его классе

//Обратите внимание: переменной сat присвоен экземпляр класса Cat, несмотря
//на то, что она объявлена с типом интерфейса Animal. Переменную сat
//можно использовать для доступа к методу talk (),она не предоставляет доступа
//к каким-нибудь другим членам класса Cat. Переменная ссылки на интерфейс
//располагает только сведениями о методах, объявленных в том интерфейсе,
//на который она ссылается. Таким образом, переменной сat нельзя пользоваться
//для доступа к методу jump (),поскольку этот метод объявлен в классе
//Cat, а не в интерфейсе Animal.

        // Работа с классом Dog
        Dog dog1 = new Dog();
        dog1.talk();

        cat2 = dog1; //теперь переменная cat2 ссылается на объект типа Dog
        cat2.talk(); // теперь кот гавкает. Кроме того, метод толк будет исполняться из класса собаки
                     // со всеми его различиями

      //  cat1 = dog1; Но гавкает только тот кот, который был создан по типу Animal.
      //  cat1.talk(); А тот, который Cat cat1 - ему нельзя присвоить переменную типа Dog



    }
}