package com.company;

import java.util.*;

public class Accounts{
    private int accountID;
    private String accountHolder;
    private ЕTypeOfCurrency typeOfCurrency;
    private double accountBalance;

    public Accounts(Persons person, ЕTypeOfCurrency type, double accountBalance) {
        this.accountHolder = person.getPersonName();
        this.typeOfCurrency = type;
        this.accountBalance = accountBalance;

        Random random = new Random();
        this.accountID = random.nextInt(1_000_000);
    }

    // Геттеры
    public int getAccountID() {
        return accountID;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public ЕTypeOfCurrency getTypeOfCurrency() {
        return typeOfCurrency;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    // Сеттеры
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setTypeOfCurrency(ЕTypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountID=" + accountID +
                ", accountHolder='" + accountHolder + '\'' +
                ", typeOfCurrency=" + typeOfCurrency +
                ", accountBalance=" + accountBalance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return accountID == accounts.accountID &&
                Double.compare(accounts.accountBalance, accountBalance) == 0 &&
                Objects.equals(accountHolder, accounts.accountHolder) &&
                typeOfCurrency == accounts.typeOfCurrency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID, accountHolder, typeOfCurrency, accountBalance);
    }



}
