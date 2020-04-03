package com.company;

import java.util.Comparator;

public class CountryMain implements ICountry {
    public static void main(String[] args) {

        // Передать элемент энума в переменную через .valueOf
        ECountry cameroon = ECountry.valueOf("CAMEROON");

        // Сравнить результат valueOf и элемент энума через оператор ==.
         if (cameroon == ECountry.CAMEROON)
             System.out.println("Элеметы равны");
         else
             System.out.println("Элеметы НЕ равны");

//         // Передать в valueOf имя несуществующего элемента
//         ECountry noCountry = ECountry.valueOf("NEVERLAND");
//         System.out.println("Несуществующий элемент: " + noCountry);
//         // Результат: Exception in thread "main" java.lang.IllegalArgumentException: No enum constant com.company.ECountry.NEVERLAND


         // Изучить что делаем метод .compareTo в энумах.
        int res = ECountry.NETHERLANDS.compareTo(ECountry.IRAN);
        System.out.println("Элемент " + ECountry.NETHERLANDS.name() + " располоржен левее элемента " + ECountry.IRAN.name() + " на " + res + " позиций.");

        // сравнить площадь двух переданных стран.
        CountryAreaComparator comparator = new CountryAreaComparator();
        int comparisonResult = comparator.compare(ECountry.AFGHANISTAN, ECountry.SOMALIA);

    }

// Я не понимаю, что с этим делать?
    @Override
    public int getTerritory() {
        return 0;
    }

    @Override
    public int getPopulation() {
        return 0;
    }

}
