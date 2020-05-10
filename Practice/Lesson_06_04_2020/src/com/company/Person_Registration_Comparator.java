package com.company;

import java.util.Comparator;

public class Person_Registration_Comparator implements Comparator<Person> {



    @Override
    public int compare(Person o1, Person o2) {
        return o1.getRegistration().compareTo(o2.getRegistration());
    }
}
