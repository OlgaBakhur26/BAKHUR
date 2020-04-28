package com.company;

public class GoTo {
    public static void main(String[] args) {
        boolean t = true;
        first: {
           second: {
              third: {
                  System.out.println("Предшествует оператору break");
                  if (t) break second;
                  System.out.println("этот оператор не будет выполняться. Он внетри third, а third внутри second");

              }
               System.out.println("Этот  тоже не выполняется. Он внутри second");

           }
            System.out.println("Этот выполняется, потому что он уже выше second. Он относится к блоку first");
        }
    }
}
