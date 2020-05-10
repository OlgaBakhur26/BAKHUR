package com.company;

public class Main8 {
    public static void main(String[] args) {
        DataContainer<Integer> data = new DataContainer<>(10);
        data.add(123);
        data.add(574);

        System.out.println(DataSum.sum(data));
    }
}
