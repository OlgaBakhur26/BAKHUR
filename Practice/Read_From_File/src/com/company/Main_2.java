package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "Numbers.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int counter = 0;

        for(String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));



        //scanner.close();

    }
}
