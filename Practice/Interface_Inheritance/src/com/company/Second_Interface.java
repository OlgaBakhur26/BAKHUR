package com.company;

import org.w3c.dom.ls.LSOutput;

public interface Second_Interface extends First_Interface {
    @Override
    void talk();

    @Override
    void walk();

    static String eat(int after_time) {
        return after_time < 18 ? "allowed": "Not allowed";

    } // Статические методы в интерфейсе с телом. Их не обязательно реализовывать в классах,
      // как и дефолтные. Доступ к ним из Мэйна через название интерфейса и точку.

    default  String sayHello(){
        return "Hello, world!";
    }

}
