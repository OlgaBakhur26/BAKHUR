package com.company;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<ECountry> {

    // В данном классе необходимо сравнить площадь двух переданных стран.

    // С помощью метода compareTo ( ) можно сравнить порядковые значения двух
    //констант одного и того же перечислимого типа. Этот метод имеет следующую общую
    //форму:
    //final int соmраrеТо(тип_перечисления е)
    //Здесь тип_перечиспения обозначает тип конкретного перечисления, а е -
    //константу, которую требуется сравнить с вызывающей константой. Напомним, что
    //обе константы (вызывающая и е) должны относиться к одному и тому же перечислимому
    //типу. Если порядковое значение вызывающей константы меньше, чем
    //у константы е, то метод compareTo ( ) возвращает отрицательное значение. Если
    //же порядковые значения обеих констант одинаковы, возвращается нуль. А если
    //порядковое значение вызывающей константы больше, чем у константы е, то возвращается
    //положительное значение.


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

    static void info (ECountry countryName){
        switch (countryName) {
            case IRAN:
                System.out.println(ECountry.IRAN.name() +
                        ECountry.IRAN.getPopulation() +
                        ECountry.IRAN.getPopulation());

            case NETHERLANDS:
                System.out.println(ECountry.NETHERLANDS.name() +
                        ECountry.NETHERLANDS.getPopulation() +
                        ECountry.NETHERLANDS.getPopulation());

                // и тд

        }

    }

}
