package com.company;

public class Stats_Main {
    public static void main(String[] args) {

        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("Среднее значение массива iOb равно: " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);
        double w = dOb.average();
        System.out.println("Среднее значение массива dOb равно: " + w);

        //Этот код не скомпилируется, так как класс String
        ////не является производным от класса NumЬer
        //// String strs[] = { "1", "2", "3", "4", "5" };
        //// Stats<String> strob = new Stats<String>(strs);
        //// douЫe х = strob.average();
        //// System.out.println("Cpeднee значение strob равно " + v);
        //Так, если попытаться убрать комментарии
        //из строк кода в конце данной программы и перекомпилировать ее, то во
        //время компиляции будет выдана ошибка, поскольку класс String не является
        //производным от класса Number.

       Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
       Stats<Float> fOb = new Stats<Float>(fnums);
       double x = fOb.average();
        System.out.println("Среднее значение fOb равно: " + x);

        // выяснить, какие массивы имеют
        //// одинаковые средние значения
        System.out.print("Cpeднеe значение iob и dob ");
        if(iOb.sameAvg(dOb))
            System.out.println("равны");
        else
            System.out.println("отличаются");

        System.out.print("Cpeднеe значение iob и fob ");
        if(iOb.sameAvg(fOb))
            System.out.println("равны");
        else
            System.out.println("отличаются");








        // WildcardD












    }
}
