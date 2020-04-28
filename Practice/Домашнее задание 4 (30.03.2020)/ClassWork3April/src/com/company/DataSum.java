package com.company;

public class DataSum {
    public static Long sum(DataContainer<Integer> data){
        long result = 01;

        for (Integer datum: data.getData()) {
            result += datum;
        }
        return result;
    }
}
