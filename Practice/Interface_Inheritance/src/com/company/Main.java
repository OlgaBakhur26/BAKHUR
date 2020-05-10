package com.company;

public class Main {

    public static void main(String[] args) {
	Ex_Class obj = new Ex_Class();

	obj.talk();
	obj.walk();

		System.out.println(obj.sayHello()); // это дефолтный метод, который не реализован в классе,
		// но его можно вызвать, поскольку он есть в интерфейсе.
		Ex2_Class obj2 = new Ex2_Class();
		System.out.println(obj2.sayHello()); // но дефолтный метод можно переопределить в классе. добавить новую реализацию его.

		System.out.println(Second_Interface.eat(16));

    }
}
