package com.company;

import java.util.Comparator;

public class BanksFundsComporator implements Comparator<Bank> {

    @Override
    public int compare(Bank bank1, Bank bank2) {
        if (bank1.getHostBankAccount() > bank2.getHostBankAccount()){
            return 1;
        }
        if (bank1.getHostBankAccount() < bank2.getHostBankAccount()){
            return -1;
        }else {
            return 0;
        }
    }
}
