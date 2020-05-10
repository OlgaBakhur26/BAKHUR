package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("hello.txt"));
        out.append("привет");
        out.flush(); // записывает поток информации



    }
}
