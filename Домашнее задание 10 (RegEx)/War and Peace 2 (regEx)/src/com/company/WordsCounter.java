package com.company;

import java.util.regex.Matcher;

public class WordsCounter implements ISearch{

    private int counter = 0;

    public int count(Matcher m){
        while (m.find()){
            counter++;
        }
        return counter;
    }
}
