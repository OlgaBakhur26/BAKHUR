package com.company;

public class Operation2 {
    public static void main(String[] args) {
        // Создаем объект
        Operation operSum = Operation.SUM;
        // и вызываем его метод
        System.out.println(operSum.method(10, 4)); // объект, метод

        Operation operMult = Operation.MULTIPLY;
        System.out.println(operMult.method(6, 4));

    }
}
