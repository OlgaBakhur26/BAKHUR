package com.company;

import java.util.Arrays;

import static com.company.Type.*;

public class Book2 {
    public static void main(String[] args) {
        Book first = new Book("Harry Potter", "J.K. Rowling", Type.FICTION);
        System.out.printf("The Book %s was written by %s. Its genre is %s.", first.name, first.author, first.type);
        System.out.println();

        switch (first.type) {
            case BELLETRE:
                System.out.println("Белетристика");
                break;
            case SCIENCE:
                System.out.println("Научная литература");
                break;
            case SCIENCE_FICTION:
                System.out.println("Научная фантастика");
                break;
            case PHANTASY:
                System.out.println("Фармацевтика");
                break;
            case FICTION:
                System.out.println("Фантастика");
                break;
        }
        Book second = new Book("War and peace", "L. Tolstoy", BELLETRE);
        System.out.printf("The Book %s was written by %s. Its genre is %s.", second.name, second.author, second.type);
        System.out.println();

        switch (second.type) {
            case BELLETRE:
                System.out.println("Белетристика");
                break;
            case SCIENCE:
                System.out.println("Научная литература");
                break;
            case SCIENCE_FICTION:
                System.out.println("Научная фантастика");
                break;
            case PHANTASY:
                System.out.println("Фармацевтика");
                break;
            case FICTION:
                System.out.println("Фантастика");
                break;
        }

        // можно все константы из enum загнать в массив и распечатать
        Type[] allGenres = Type.values();
        System.out.println("Распечатать массив констант: " + Arrays.toString(allGenres));

        // а можно распечатать все константы массива по одной через for each
        System.out.print("Рваспечатать все константы массива через for each: ");
        for(Type genre: allGenres){
            System.out.print(genre + ", ");
        }
        System.out.println();

        // Можно распечатать каждый элемент энама и без массива
        System.out.print("Распечатка без массива через .values(): ");
        for (Type genre: Type.values()){
            System.out.print(genre + ", ");
        }
        System.out.println();

        // Можно узнать порядковый номер константы в enum. Нумерация с нуля
        System.out.println("Белнтристика: № " + BELLETRE.ordinal());

        // а если не с нуля, то надо запомнить номер в переменную и прибавить 1
        int numberBel = BELLETRE.ordinal() + 1;
        System.out.println("Порядковый номер белетристики: " + numberBel);








    }
}
