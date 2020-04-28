package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter out1 = new BufferedWriter(new FileWriter("hello1.txt"));

        long strat1 = System.currentTimeMillis();
        for (int i = 0; i < 1000_000; i++) {
            out1.append("привет");
            out1.flush();
        }
        long end1 = System.currentTimeMillis();
        long time1 = end1 - strat1;
        System.out.println(time1);

    }
}
