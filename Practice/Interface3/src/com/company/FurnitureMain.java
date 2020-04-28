package com.company;

public class FurnitureMain {

    public static void main(String[] args) {
        // использовать ссылку на вложенный интерфейс
        Chair.Furniture smallTable = new Table("Table");

        if (smallTable.isWooden("yes"))
            System.out.println("Это объект деревянной мебели");
        else
            System.out.println("Это не деревянная мебель");



    }
}
