package com.company;/* Эта программа содержит ошибку. В последовательности операторов catch подкласс исключений должен
быть указан перед его суперклассом, иначе это приведет к недостижимому коду и ошибке во время компиляции.*/

class SuperSubCatch {
    public static void main(String args[]) {
        try {
            int а = 0;
            int Ь = 42 / а;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }

/* Этот оператор catch вообще не будет достигнут, так как подкласс ArithmeticException является
производным от класса Exception. */
//         catch (ArithmeticException е) {
//            // ОШИБКА: недостижимый код!
//            System.out.println("Этoт код вообще недостижим.");
//         }
    }
}
// Если попытаться скомпилировать эту программу, то появится сообщение
//об ошибке, уведомляющее, что второй оператор catch недостижим, потому что
//исключение уже перехвачено. Класс исключения типа Ari thmeticException
//является производным от класса Exception, и поэтому первый оператор catch
//обработает все ошибки, относящиеся к классу Exception, включая и класс
//Ari thmeticExcept ion. Это означает, что второй оператор catch так и не будет
//выполнен. Чтобы исправить это положение, придется изменить порядок следования
//операторов catch.