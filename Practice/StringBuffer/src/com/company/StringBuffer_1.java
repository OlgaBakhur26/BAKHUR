package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StringBuffer_1 {
    public static void main(String[] args) {

// Сравнить методы length() и capacity() из класса StringBuffer
	StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Буффер: " + sb); // Буффер: Hello
        System.out.println("Длина: " + sb.length()); // длина 5
        System.out.println("Емкость: " + sb.capacity()); // Емкость: 21 - текущий объем выделенной памяти
        System.out.println();                            // поскольку 16 дополнительных символов добавляются
                                                         //автоматически.

// Методы charAt ( ) и setCharAt ( )
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Буффер до: " + sb);
        System.out.println("До вызова charAt(1): " + sb2.charAt(1));
        sb2.setCharAt(1, 'i'); // заменили символ по индексу 1
        sb2.setLength(2); // новая дляна короче старой. Обрезалось по 2 индекс включительно
        System.out.println("Буфер после: " + sb2);
        System.out.println("После вызова charAt(1)" + sb2.charAt(1));
        System.out.println();


// Метод getChars ()
StringBuffer sb3 = new StringBuffer("This is an example");

        char[] array = new char[10];
        sb3.getChars(11, 18, array, 2);
        System.out.println("Скопировать символы из буфера в массив: " + Arrays.toString(array));
        System.out.println();

// Метод append ( ) присоединяет строковое представление любого другого типа данных в конце
// вызывающего объекта типа StringBuffer.
        String s;
        int a = 42;
        StringBuffer sb4 = new StringBuffer(40);

        s = sb4.append("a = ").append(a).append("!").toString(); // записываем в обычный String
        System.out.println(s); // toString() нужен чтобы объект StringBuffer преобразовать в обычный String
        System.out.println();

// Метод insert ()
        StringBuffer sb5 = new StringBuffer("Мне мороженое!");
        sb5.insert(4, "нравится "); // Здесь параметр индекс обозначает индекс позиции, на которой
                                              // символьная строка будет вставлена в вызывающий объект типа
                                              // StringBuffer.
        System.out.println(sb5);
        System.out.println();

// Метод reverse ( ) возвращает объект с обратным порядком следования символов по сравнению с
// вызывающим объектом
        StringBuffer sb6 = new StringBuffer("Оля");
        System.out.println("обычный порядок: " + sb6);

        sb6.reverse();
        System.out.println("обратный порядок: " + sb6);
        System.out.println();

// Метод delete () удаляет последовательность символов из вызывающего объекта (с .. по..)
// Метод deleteCharAt () удаляет символ на указанной позиции.
        StringBuffer sb7 = new StringBuffer("Этo простой тест.");

        sb7.delete(3, 11);
        System.out.println("Пocлe вызова метода delete(3, 11): " + sb7);

        sb7.deleteCharAt(0);
        System.out.println("Пocлe вызова метода deleteCharAt(0): " + sb7);
        System.out.println();

// Метод replace (), можно заменить один набор символов другим в объекте типа StringBuffer.
        StringBuffer sb8 = new StringBuffer("МОроженое");
        System.out.println("До замены: " + sb8);
        sb8.replace(0, 2, "ПИ");
        System.out.println("После замены: " + sb8);
        System.out.println();

// Метод substring (0) или Метод substring (0, 5) - два конструктора
        StringBuffer sb9 = new StringBuffer("Хорошая погода");
        System.out.println(sb9);

        String str = sb9.substring(8);
        System.out.println(str); // можно записать в обычный стринг
        StringBuffer sb10 = new StringBuffer(sb9.substring(8));// Но можно и в новый объект StringBuffer
        System.out.println(sb10);
        System.out.println(sb9); // при этом изначальный объект не поменялся

        String str2 = sb9.substring(0, 7);
        System.out.println(str2);

// int indexOf(String строка) или int indexOf(String строка, int начальный_индекс)
        StringBuffer sb11 = new StringBuffer("ла-ла-ла");
        System.out.println(sb11.indexOf("-ла")); // 0
        System.out.println(sb11.indexOf("-ла", 4)); // 0

// int lastindexOf
        System.out.println(sb11.lastIndexOf("ла"));







    }
}
