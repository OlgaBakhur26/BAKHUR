package com.company;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import static com.company.CountryAreaComparator.info;
import static com.company.ECountry.IRAN;
import static java.awt.SystemColor.info;

public class NewMain_2 {
    public static void main(String[] args) {
        ECountry country1, country2, country3;

        System.out.println("Все константы стран и их порядковые индексы: ");
        for (ECountry country : ECountry.values())
            System.out.println("Порядковый номер " + country + ": " + country.ordinal());
        System.out.println();

        System.out.println("Все константы стран и их порядковые номера: ");
        for (ECountry country : ECountry.values())
            System.out.println("Порядковый номер " + country + ": " + (country.ordinal() + 1));
        System.out.println();


        // продемонстрировать применение
        // методов compareTo() и equals()
        country1 = IRAN;
        country2 = ECountry.UKRAINE;
        country3 = ECountry.SWITZERLAND;

        if (country1.compareTo(country2) < 0)
            System.out.println(country1 + " левее " + country2);
        if (country1.compareTo(country2) < 0)
            System.out.println(country1 + " равно " + country2);
        if (country1.compareTo(country2) > 0)
            System.out.println(country1 + " правее " + country2);

        System.out.println(ECountry.SOMALIA.name());


        // SWITCH, который возвращает название страны, ее территорию и населени
        CountryAreaComparator ex = new CountryAreaComparator();
        info(IRAN);




    }

}
