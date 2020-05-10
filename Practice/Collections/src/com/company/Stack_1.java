package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // Last in, first out. В противоположность Queue. Стопка книг
// Добавляются элементы с помощью метода .push(). Это как add или put
        stack.push(5);
        stack.push(3);
        stack.push(1);

// 1. Метод .pop() достает и УДАЛЯЕТ последний добавленный элемент из стека. Это как .remove() в Queue
        System.out.println(stack.pop()); // Итог: 1

// И каждый раз, когда вызываем метод .pop(), достается следующее значение
        System.out.println(stack.pop()); // Итог: 3
        System.out.println(stack.pop()); // Итог: 5

// но когда элементов в стеке больше не осталось, то выбрасывается исключение
        //System.out.println(stack.pop()); // Итог: java.util.EmptyStackException

        System.out.println(stack); // теперь стек пустой - []

// Метод .peek() достает и НЕ удаляет последний добавленный элемент из стека. Это как .peek() в Queue
        stack.push(8);
        stack.push(4);
        stack.push(3);

        System.out.println(stack); // [8, 4, 3]

        System.out.println(stack.peek()); // Постянно показывает только последний элемент - 3
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack); // Элементы не удалились - [8, 4, 3]

// Метод .empty() возвращает true, если стек пустой, и возвращает false, если стек не пустой
        while (!stack.empty()){
            System.out.println(stack.pop()); // выводит на экран и удаляет последний элемент из стека,
            // пока он не станет пустым
        }
        // Итог:
        //3
        //4
        //8



    }


}
