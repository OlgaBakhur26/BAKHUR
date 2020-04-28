package com.company;

import java.util.Arrays;

public class NewMain implements ICountry{
    public static void main(String[] args) {

//1)       // Объявив перечисление, можно создавать переменные данного типа. Но, несмотря
        //на то, что перечисления определяют тип класса, получать экземпляры класса
        //перечислимого типа с помощью операции new нельзя. Вместо этого переменная
        //перечисления объявляется и применяется практически так же, как и переменные
        //примитивных типов. В приведенном ниже примере объявляется переменная ар
        //перечислимого типа ECountry.
        //ECountry x;
        //Переменная ар относится к типу ECountry, и поэтому ей можно присвоить только
        //те значения, которые определены в перечислении. В следующем примере переменной
        // x присваивается значение ECountry:
        // x = ECountry;

        //Обявление переменной, в которую записываем константу
        ECountry x = ECountry.BELARUS;
        System.out.println(x);

 //2)  Коrда выводится константа перечислимоrо типа, например методом
        //println (),то отображается ее имя. Например, в следующей строке кода:
        System.out.println(ECountry.CANADA);

// 3) Сравнение элементов энама и их же, но переданных в переменную, через ==
        if (x == ECountry.BELARUS)
            System.out.println("Элементы энама и их же, но переданных в переменную, можно сравнивать через ==");
// Создать массив из энвма через .values
        ECountry countryArray[] = ECountry.values();
        System.out.println(Arrays.toString(countryArray));
        // Или отобразить по отдельным элементам
        for (ECountry country : countryArray)
            System.out.println(country);

        System.out.println("Распечатать элементы энама, приведенные к массиву через for each и с помощью .ordinal");
        for (ECountry country : countryArray) {
            System.out.println(countryArray[country.ordinal()]);
        }
        System.out.println("конец с ordinal");

        // Применить .valueOf()
        System.out.println(ECountry.valueOf("CAMEROON")); // отображается один элемент

        // отобразим все элементы через цк=икл и .valueOf()
//        for (ECountry country : countryArray)
//            System.out.print(ECountry.valueOf(country)); // не получается, т.к. .valueOf() требует String
//                                                         // в параметрах, а не переменную.

//        // .ordinal
//        System.out.println(countryArray.length);
//        for (int i = 0; i < 10; i++) {
//
//        }


        // Получим население и территории всех стран
        for (ECountry country : ECountry.values())
            System.out.println(country + ": территория - " + country.getTerritory() + ", население - " + country.getPopulation());


        System.out.println(ECountry.NETHERLANDS.ordinal());


    }

    @Override
    public int getTerritory() {
        return 0;
    }

    @Override
    public int getPopulation() {
        return 0;
    }
}
