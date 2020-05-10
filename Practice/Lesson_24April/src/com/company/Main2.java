package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        try{
            BufferedWriter out2 = new BufferedWriter(new FileWriter("hello2.txt"));

            long strat2 = System.currentTimeMillis();
            for (int i = 0; i < 1000_000; i++) {
                out2.append("привет\n");
            }
            out2.flush();
            out2.close();
            long end2 = System.currentTimeMillis();
            long time2 = end2 - strat2;
            System.out.println(time2);
        }catch (IOException e){
            System.out.println("ОШИБКА!!!");
        }
    }
}
