package com.company;

import java.util.Comparator;


public class OperationsComparator implements Comparator<Bank> {


    @Override
    public int compare(Bank bank1, Bank bank2) {
        if ((bank1.getInOperationsCounter() + bank1.getOutOperationsCounter()) < // обратный порядок
                (bank2.getInOperationsCounter() + bank2.getOutOperationsCounter())){
            return 1;
        }
        if ((bank1.getInOperationsCounter() + bank1.getOutOperationsCounter()) >
                (bank2.getInOperationsCounter() + bank2.getOutOperationsCounter())){
            return -1;
        }else {
            return 0;
        }
    }
}
