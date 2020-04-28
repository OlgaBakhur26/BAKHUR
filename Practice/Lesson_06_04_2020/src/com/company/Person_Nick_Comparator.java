package com.company;

import java.util.Comparator;

public class Person_Nick_Comparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
