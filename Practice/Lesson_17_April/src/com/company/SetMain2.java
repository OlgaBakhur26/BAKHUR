package com.company;

import java.util.HashSet;
import java.util.Set;

public class SetMain2 {
    public static void main(String[] args) {
        Set<Passport> data = new HashSet<>();

        data.add(new Passport("Ольга", "123456789", 26)); // не распечатаются по порядке
        data.add(new Passport("Ольга", "123456789", 27)); // зависит от хэша
        data.add(new Passport("Ольга", "123456789", 56)); // несмотря на то, что содержимое одинаково
        data.add(new Passport("Ольга", "123456789", 100));
        data.add(new Passport("Александр", "111111166", 46));
        data.add(new Passport("Виктор", "6567624", 20));

        for (Passport item : data) {
            System.out.println(item);
        }
    }
}
