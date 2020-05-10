package com.company;

import java.io.*;
import java.sql.SQLOutput;

public class Main6 {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("Hello.txt"))){
            String line = in.readLine();
            while (line != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Произошла ошибка " + e.getMessage());

        }
    }
}
