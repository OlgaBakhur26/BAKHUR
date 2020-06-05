package com.company;

import java.util.*;

public class Accounts {
    private String bankName;
    private String accountHolder;
    private int accountID;
    private Bank.ЕTypeOfCurrency typeOfCurrency;
    private double accountBalance;
    public static volatile Integer idCounter = 0;
    private static Map<String, List<Accounts>> accountsMap = new HashMap<>();

    public Accounts(Integer id, Persons person, Bank.ЕTypeOfCurrency type, double accountBalance) {
        this.accountHolder = person.getPersonName();
        this.accountID = id;
        this.typeOfCurrency = type;
        this.accountBalance = accountBalance;
    }

    public Accounts(Bank bank, Persons person, Bank.ЕTypeOfCurrency type, double accountBalance) {
        idCounter++; // при создании каждого следующего аккаунта ему будет присваиваться ID на 1 больше
        this.bankName = bank.getBankName();
        this.accountHolder = person.getPersonName();
        this.accountID = idCounter;
        this.typeOfCurrency = type;
        this.accountBalance = accountBalance;

            if(!accountsMap.containsKey(bank.getBankName())){
                accountsMap.put(bank.getBankName(), new ArrayList<Accounts>());
                accountsMap.get(bank.getBankName()).add(this);
            }else{
                accountsMap.get(bank.getBankName()).add(this);
            }
    }





    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Bank.ЕTypeOfCurrency getTypeOfCurrency() {
        return typeOfCurrency;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setTypeOfCurrency(Bank.ЕTypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public Integer getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(Integer idCounter) {
        this.idCounter = idCounter;
    }

    public static Map<String, List<Accounts>> getAccountsMap() {
        return accountsMap;
    }

    public static void setAccountsMap(Map<String, List<Accounts>> accountsMap) {
        Accounts.accountsMap = accountsMap;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "bankName='" + bankName + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountID=" + accountID +
                ", typeOfCurrency=" + typeOfCurrency +
                ", accountBalance=" + accountBalance +
                ", idCounter=" + idCounter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return accountID == accounts.accountID &&
                Double.compare(accounts.accountBalance, accountBalance) == 0 &&
                Objects.equals(bankName, accounts.bankName) &&
                Objects.equals(accountHolder, accounts.accountHolder) &&
                typeOfCurrency == accounts.typeOfCurrency &&
                Objects.equals(idCounter, accounts.idCounter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, accountHolder, accountID, typeOfCurrency, accountBalance, idCounter);
    }
}
