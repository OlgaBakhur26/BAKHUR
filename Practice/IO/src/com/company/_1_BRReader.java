package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_BRReader {

    public static void main(String[] args) throws IOException {
// Использовать метд var.read() из класс BufferedReader для чтения СИМВОЛОВ из консоли (по ОДНОМУ)
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // считывает по 1 символу из введенных
        System.out.println("Введите символ 'q' для выхода.");
        do{
            c = (char) br.read();
            System.out.println(c); // распечатка останавливается на символе 'q'
        }while (c != 'q');
    }
}

// Использовать метд var.readLine() из класс BufferedReader для чтения СИМВОЛЬНЫХ СТРОК из консоли (много символов)
// Этот метод возвращает объект типа String.

// Эта программа читает и выводит текстовые строки текста до тех пор, пока не будет введено слово "стоп".
class _2_BRReader{
    public static void main(String[] args) throws IOException{
//создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения");
        do{
            str = br.readLine(); // Каждый раз записывает в String введенную строку (полностью, а не посмимвольно)
            System.out.println(str);
        }while(!str.equals("стоп")); //сравнивает со словом "стоп"

    }
}

class _3_TinyEdit{
    public static void main(String[] args) throws IOException{
// В следующем далее примере программы демонстрируется простейший текстовый редактор.
// С этой целью сначала создается массив объектов типа String, а затем читаются текстовые строки,
// каждая из которых сохраняется в элементе массива. Чтение производится до 100 строк или до тех пор,
// пока не будет введено слово "стоп':

//создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Bвeдитe строки текста.");
        System.out.println("Bвeдитe 'стоп' для завершения.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("стоп")){
                break;
            }
        }
        System.out.println("\nСодержимое вашего файла: ");
        // вывести текстовые строки
        for (int i = 0; i <100; i++) {
            if(str[i].equals("стоп")){
                break;
            }
            System.out.println(str[i]);
        }





    }
}








