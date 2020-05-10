package com.company;

public class _2_WriteBytes {
    public static void main(String[] args) {
// Класс PrintStream описывает поток вывода и является производным от класса OutputStream,
// поэтому в нем реализуется также низкоуровневый метод .write()

// Продемонстрировать применение метода System.out.write()
// метод wri te () можно применять для записи данных, выводимых на консоль.
        int b;
        b = 'A';
        System.out.write(b); // A
        System.out.write('\n'); // Если закомментировать эту строку, то 'b' не распечатается
        //System.out.write('h'); // Если записать строку или несколько символов, то выходит ошибка компилляции
        // Если записать один символ (другой, не \n), то вообще ничего не распечатывается. Т.о. Нужен именно символ (\n)
    }
}

class PrintWriter{
    public static void main(String[] args) {
// В приведенном ниже примере программы демонстрируется применение класса PrintWriter для управления
// выводом данных на консоль.
        PrintWriter pw = new PrintWriter(System.out, true);
        


    }
}
