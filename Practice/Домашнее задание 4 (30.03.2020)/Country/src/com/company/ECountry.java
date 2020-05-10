package com.company;


public enum  ECountry implements ICountry { // перечисления не наследуются и не м.б. суперклассами
    NETHERLANDS (41_543, 17_280_397), // все константы являются объектами
    USA(9_833_517, 332_639_102),
    SWITZERLAND (41_277, 8_403_994),
    CAMEROON (475_440, 27_744_989),
    AFGHANISTAN (652_230, 36_643_815),
    UKRAINE (603_550, 43_922_939),
    CANADA (9_984_670, 37_694_085),
    BELARUS (207_600, 9_477_918),
    SOMALIA (637_657, 11_757_124),
    IRAN (1_648_195, 84_923_314),
    PAKISTAN;

    public int territory; // sq km
    public int population; // persons

    ECountry(int territory, int population){
        this.territory = territory;
        this.population = population;
    }

    // Перегружаемый конструктор для константы без параметров
    ECountry(){ // будут выводиться нули
        }

    public int getTerritory(){
        return territory;
    }

    public int getPopulation() {
        return population;
    }
}
