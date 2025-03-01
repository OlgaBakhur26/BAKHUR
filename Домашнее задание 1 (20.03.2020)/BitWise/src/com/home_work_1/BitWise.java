package com.home_work_1;

public class BitWise {

    public static void main(String[] args) {
        // Задание: Использовать ВСЕ возможные побитовые операции с числами 42 и 15; - 42 и - 15.
        int a = 42; // 0010_1010 (bin)
        int b = 15; // 0000_1111 (bin)
        int c = - 42; // 1101_0110 (bin)
        int d = - 15; // 1111_0001 (bin)

        //1. Побитовое НЕ
        System.out.println("Побитовое отрицание числа 42: " + ~a);
        System.out.println("Побитовое отрицание числа 15: " + ~b);
        System.out.println("Побитовое отрицание числа -42: " + ~c);
        System.out.println("Побитовое отрицание числа -15: " + ~d);
        /* ~a: 42 (dec) == 0010_1010 (bin). После инвертирования всех битов получается 1101_0101 (bin).
           ~b: 15 (dec) == 0000_1111 (bin). После инвертирования всех битов получается 1111_0000 (bin).
           ~c: -42 (dec) == 1101_0110 (bin) - получилось в результате инверсии всех битов и прибавления 1.
           Чтобы выполнить побитовое отрицание нужно снова инверсировать все биты (результат: 0010_1001)
           ~d: -15 (dec) == 1111_0001 (bin) -  получилось в результате инверсии всех битов и прибавления 1.
           Чтобы выполнить побитовое отрицание нужно снова инверсировать все биты (результат: 0000_1110). */


       //2. Побитовое И
        System.out.print("Побитовое И чисел 42 и 15: ");
        System.out.println(a&b);
        /*    0010_1010
            & 0000_1111
              ---------
              0000_1010 (bin) == 10 (dec) */

        System.out.print("Побитовое И чисел -42 и -15: ");
        System.out.println(c&d);
         /*   1101_0110
            & 1111_0001
              ---------
              1101_0000 (bin) */

        //3. Побитовое ИЛИ
        System.out.print("Побитовое ИЛИ чисел 42 и 15: ");
        System.out.println(a|b);
         /*   0010_1010
            | 0000_1111
              ---------
              0010_1111 (bin) */
         System.out.print("Побитовое ИЛИ чисел -42 и -15: ");
         System.out.println(c|d);

         /*  1101_0110
         │   1111_0001
             ---------
             1111_0111 (bin) */

        // 4. Исключающее ИЛИ
        System.out.print("Побитовое исключающее ИЛИ чисел 42 и 15: ");
        System.out.println(a^b);

        /*   0010_1010
             0000_1111
             ---------
             0010_0101 (bin) */

        System.out.print("Побитовое исключающее ИЛИ чисел -42 и -15: ");
        System.out.println(c^d);
        /*   1101_0110
           ^ 1111_0001
             ---------
             0010_0111 (bin) */

        // 5. Сдвиг влево
        System.out.print("Операция сдвига влево на 3 знкака для числа 42: ");
        System.out.println(a<<3);
        // 0010_1010 будет выглядеть, как 0001_0101_0000

        System.out.print("Операция сдвига влево на 3 знкака для числа 15: ");
        System.out.println(b<<3);
        // 0000_1111 будет выглядеть, как 0000_0111_1000

        System.out.print("Операция сдвига влево на 3 знкака для числа -42: ");
        System.out.println(c<<3);
        // 1101_0110 будет выглядеть, как 0110_1011_0000

        System.out.print("Операция сдвига влево на 3 знкака для числа -15: ");
        System.out.println(c<<3);
        // 1111_0001 будет выглядеть, как 0111_1000_1000

        // 6. Сдвиг вправо
        System.out.print("Операция сдвига вправо на 3 знкака для числа 42: ");
        System.out.println(a>>3);
        // 0010_1010 будет выглядеть, как 0000_0101

        System.out.print("Операция сдвига вправо на 3 знкака для числа 15: ");
        System.out.println(b>>3);
        // 0000_1111 будет выглядеть, как 0000_0001

        System.out.print("Операция сдвига вправо на 3 знкака для числа -42: ");
        System.out.println(c>>3);
        // 1101_0110 будет выглядеть, как 1111_1010.

        System.out.print("Операция сдвига вправо на 3 знкака для числа -15: ");
        System.out.println(d>>3);
        // 1111_0001 будет выглядеть, как 1111_1110.

        // 7. Беззнаковый сдвиг вправо
        System.out.print("Операция беззнакового сдвига вправо на 3 знкака для числа 42: ");
        System.out.println(a>>>3);
        // 0000_1111 будет выглядеть, как 0000_0001


        System.out.print("Операция беззнакового сдвига вправо на 3 знкака для числа 15: ");
        System.out.println(b>>>3);
        // 0000_1111 будет выглядеть, как 0000_0001

        System.out.print("Операция беззнакового сдвига вправо на 3 знкака для числа -42: ");
        System.out.println(c>>>3);
        // 1101_0110 будет выглядеть, как 0001_1010.

        System.out.print("Операция беззнакового сдвига вправо на 3 знкака для числа -15: ");
        System.out.println(d>>>3);
        // 1111_0001 будет выглядеть, как 0001_1110.

        // 8. Побитовый И с присваиванием
        System.out.print("Побитовая операция И с присваиванием для чисел 42 и 15: ");
        System.out.println(a &= b);
        // то же, что и a = a & b

        System.out.print("Побитовая операция И с присваиванием для чисел -42 и -15: ");
        System.out.println(c &= d);
        // то же, что и c = c & d

        // 9. Побитовый ИЛИ с присваиванием
        System.out.print("Побитовая операция ИЛИ с присваиванием для чисел 42 и 15: ");
        System.out.println(a |= b);
        // то же, что и a = a | b

        System.out.print("Побитовая операция ИЛИ с присваиванием для чисел -42 и -15: ");
        System.out.println(c |= d);
        // то же, что и c = c | d

        // 10. Побитовый исключающее ИЛИ с присваиванием
        System.out.print("Побитовая операция исключающее ИЛИ с присваиванием для чисел 42 и 15: ");
        System.out.println(a ^= b);
        // то же, что и a = a ^ b

        System.out.print("Побитовая операция исключающее ИЛИ с присваиванием для чисел -42 и -15: ");
        System.out.println(c ^= d);
        // то же, что и c = c ^ d

        // 11. Сдвиг влево с присваиванием
        System.out.print("Побитовая операция сдвиг влево на 3 знака с присваиванием для чисел 42 и 15: ");
        System.out.println(a <<= b);
        // то же, что и a = a << b

        System.out.print("Побитовая операция сдвиг влево на 3 знака с присваиванием для чисел -42 и -15: ");
        System.out.println(c <<= d);
        // то же, что и c = c << d

        // 12. Сдвиг вправо с присваиванием
        System.out.print("Побитовая операция сдвиг вправо на 3 знака с присваиванием для чисел 42 и 15: ");
        System.out.println(a >>= b);
        // то же, что и a = a >> b

        System.out.print("Побитовая операция сдвиг вправо на 3 знака с присваиванием для чисел -42 и -15: ");
        System.out.println(c >>= d);
        // то же, что и c = c >> d

        // 12. Беззнаковый сдвиг вправо с присваиванием
        System.out.print("Побитовая операция беззнакового сдвига вправо на 3 знака с присваиванием для чисел 42 и 15: ");
        System.out.println(a >>>= b);
        // то же, что и a = a >>> b

        System.out.print("Побитовая операция беззнакового сдвига вправо на 3 знака с присваиванием для чисел -42 и -15: ");
        System.out.println(c >>>= d);
        // то же, что и c = c >>> d

    }
}
