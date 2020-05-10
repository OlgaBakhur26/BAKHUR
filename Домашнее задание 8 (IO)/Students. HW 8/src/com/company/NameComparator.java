package com.company;

import java.util.Comparator;

public class NameComparator implements Comparator<Students> {

    public int compare(Students obj1, Students obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }
}
