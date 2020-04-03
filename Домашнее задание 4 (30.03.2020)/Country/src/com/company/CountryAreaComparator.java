package com.company;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<ECountry> {

    // В данном классе необходимо сравнить площадь двух переданных стран.
    @Override
    public int compare(ECountry firstCountry, ECountry secondCountry) {
        if (firstCountry.getTerritory() == secondCountry.getTerritory()){
            System.out.println(firstCountry + " равна по территории стране " + secondCountry);
            return 0; // число выводиться в консоль не будет, т.к. я вызываю метод не через sout.
        }
        else if (firstCountry.getTerritory() > secondCountry.getTerritory()){
            System.out.println(firstCountry + " больше по территории, чем страна " + secondCountry);
            return 1;
        }
        else{
            System.out.println(firstCountry + " меньше по территории, чем страна " + secondCountry);
            return -1;
        }
    }
}
