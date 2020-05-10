package com.company;

import java.util.Arrays;
import java.util.List;

public class List3For {
    public static void main(String[] args) {
        
        List<Integer> grades2 = Arrays.asList(5, 3, 2, 6, 3); // задать значения Листу

        for (int i = 0; i < grades2.size(); i++) {
            grades2.set(i, grades2.get(i) * 2);
            System.out.println(grades2.get(i));
            
        }

// for each loop
        for (int grade: grades2){
           System.out.println(grade);
        }

    }
}
