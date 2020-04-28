package com.company;

public class Main_1 {

    public static void main(String[] args) {

        System.out.println(Integer.valueOf(10));
        int x = Integer.valueOf("10");
        int y = 5;
        System.out.println(x + y);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer firttInteger = new Integer(200);
        Integer secondInteger = 300;
        System.out.println(firttInteger.compareTo(secondInteger));
        String z = "135";
        System.out.println(Integer.parseInt(z)); // преобразовали строку в интеджер

        String w = "2147483648";
        System.out.println(Long.parseLong(w));

        int f = Integer.SIZE;
        System.out.println(f);

        int k = Integer.compare(5, 6);
        System.out.println(k);
        System.out.println(Byte.MAX_VALUE);



    }

//    static Character valueOf(char ch);
}
