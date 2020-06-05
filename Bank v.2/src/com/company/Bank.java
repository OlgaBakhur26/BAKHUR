package com.company;

import java.util.*;

public class Bank {
    public  volatile Integer idCounter = 0;

    private String bankName;
    private ЕTypeOfCurrency basicCurrency;
    private double bynToUsdExchangeRate;
    private double bynToEurExchangeRate;
    private double usdToBynExchangeRate;
    private double usdToEurExchangeRate;
    private double eurToBynExchangeRate;
    private double eurToUsdExchangeRate;

    private Map<ЕTypeOfCurrency, Map<ЕTypeOfCurrency, Pair>> convertors = new HashMap<>();

    private double hostBankAccount;
    private int inOperationsCounter;
    private int outOperationsCounter;
    private static List<Bank> banksList = new ArrayList<>();;
    private List<Accounts> accounts = new ArrayList<>();

    public enum ЕTypeOfCurrency {
        BYN,
        USD,
        EUR
    }

    private Bank(String bankName, ЕTypeOfCurrency basicCurrency, double hostBankAccount, List<Pair> pairs) {
        this.bankName = bankName;
        this.basicCurrency = basicCurrency;
        this.hostBankAccount = hostBankAccount;

        for (Pair pair : pairs) {
            Map<ЕTypeOfCurrency, Pair> values;
            if(convertors.containsKey(pair.from)){
                values = convertors.get(pair.from);
            } else {
                values = new HashMap<>();
            }
            if(!values.containsKey(pair.to)){
                values.put(pair.to, pair);
            }
        }

        this.inOperationsCounter = 0;
        this.outOperationsCounter = 0;
        banksList.add(this);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public ЕTypeOfCurrency getBasicCurrency() {
        return basicCurrency;
    }

    public double getBynToUsdExchangeRate() {
        return bynToUsdExchangeRate;
    }

    public void setBynToUsdExchangeRate(double bynToUsdExchangeRate) {
        this.bynToUsdExchangeRate = bynToUsdExchangeRate;
    }

    public double getBynToEurExchangeRate() {
        return bynToEurExchangeRate;
    }

    public void setBynToEurExchangeRate(double bynToEurExchangeRate) {
        this.bynToEurExchangeRate = bynToEurExchangeRate;
    }

    public double getUsdToBynExchangeRate() {
        return usdToBynExchangeRate;
    }

    public void setUsdToBynExchangeRate(double usdToBynExchangeRate) {
        this.usdToBynExchangeRate = usdToBynExchangeRate;
    }

    public double getUsdToEurExchangeRate() {
        return usdToEurExchangeRate;
    }

    public void setUsdToEurExchangeRate(double usdToEurExchangeRate) {
        this.usdToEurExchangeRate = usdToEurExchangeRate;
    }

    public double getEurToBynExchangeRate() {
        return eurToBynExchangeRate;
    }

    public void setEurToBynExchangeRate(double eurToBynExchangeRate) {
        this.eurToBynExchangeRate = eurToBynExchangeRate;
    }

    public double getEurToUsdExchangeRate() {
        return eurToUsdExchangeRate;
    }

    public void setEurToUsdExchangeRate(double eurToUsdExchangeRate) {
        this.eurToUsdExchangeRate = eurToUsdExchangeRate;
    }

    public void setBasicCurrency(ЕTypeOfCurrency basicCurrency) {
        this.basicCurrency = basicCurrency;
    }

    public double getHostBankAccount() {
        return hostBankAccount;
    }

    public void setHostBankAccount(double hostBankAccount) {
        this.hostBankAccount = hostBankAccount;
    }

    public static List<Bank> getBanksList() {
        return banksList;
    }

    public int getInOperationsCounter() {
        return inOperationsCounter;
    }

    public void setInOperationsCounter(int inOperationsCounter) {
        this.inOperationsCounter = inOperationsCounter;
    }

    public int getOutOperationsCounter() {
        return outOperationsCounter;
    }

    public void setOutOperationsCounter(int outOperationsCounter) {
        this.outOperationsCounter = outOperationsCounter;
    }

    public static void setBanksList(List<Bank> banksList) {
        Bank.banksList = banksList;
    }

    public double convert(ЕTypeOfCurrency from, ЕTypeOfCurrency to, double value){
//        Map<ЕTypeOfCurrency, Pair> еTypeOfCurrencyPairMap = this.convertors.get(from);
//        Pair pair = еTypeOfCurrencyPairMap.get(to);
//
//        return pair.convert(value);
        return this.convertors.get(from).get(to).convert(value);
    }

    public Accounts registration(Persons person, Bank.ЕTypeOfCurrency type, double accountBalance){
        Accounts account = new Accounts(++idCounter, person, type, accountBalance);
        this.accounts.add(account);

        return account;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", basicCurrency=" + basicCurrency +
                ", bynToUsdExchangeRate=" + bynToUsdExchangeRate +
                ", bynToEurExchangeRate=" + bynToEurExchangeRate +
                ", usdToBynExchangeRate=" + usdToBynExchangeRate +
                ", usdToEurExchangeRate=" + usdToEurExchangeRate +
                ", eurToBynExchangeRate=" + eurToBynExchangeRate +
                ", eurToUsdExchangeRate=" + eurToUsdExchangeRate +
                ", hostBankAccount=" + hostBankAccount +
                ", inOperationsCounter=" + inOperationsCounter +
                ", outOperationsCounter=" + outOperationsCounter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Double.compare(bank.bynToUsdExchangeRate, bynToUsdExchangeRate) == 0 &&
                Double.compare(bank.bynToEurExchangeRate, bynToEurExchangeRate) == 0 &&
                Double.compare(bank.usdToBynExchangeRate, usdToBynExchangeRate) == 0 &&
                Double.compare(bank.usdToEurExchangeRate, usdToEurExchangeRate) == 0 &&
                Double.compare(bank.eurToBynExchangeRate, eurToBynExchangeRate) == 0 &&
                Double.compare(bank.eurToUsdExchangeRate, eurToUsdExchangeRate) == 0 &&
                Double.compare(bank.hostBankAccount, hostBankAccount) == 0 &&
                inOperationsCounter == bank.inOperationsCounter &&
                outOperationsCounter == bank.outOperationsCounter &&
                Objects.equals(bankName, bank.bankName) &&
                basicCurrency == bank.basicCurrency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, basicCurrency, bynToUsdExchangeRate, bynToEurExchangeRate, usdToBynExchangeRate,
                usdToEurExchangeRate, eurToBynExchangeRate, eurToUsdExchangeRate, hostBankAccount, inOperationsCounter,
                outOperationsCounter);
    }

    public static class Pair{
        private ЕTypeOfCurrency from;
        private ЕTypeOfCurrency to;
        private double value;

        public Pair(ЕTypeOfCurrency from, ЕTypeOfCurrency to, double value) {
            this.from = from;
            this.to = to;
            this.value = value;
        }

        public double convert(double valueToConvert){
            return valueToConvert * value;
        }
    }

    public static class BankBuilder {
        String bankName;
        Bank.ЕTypeOfCurrency basicCurrency;
        double bynToUsdExchangeRate;
        double bynToEurExchangeRate;
        double usdToBynExchangeRate;
        double usdToEurExchangeRate;
        double eurToBynExchangeRate;
        double eurToUsdExchangeRate;
        double hostBankAccount;

        public BankBuilder(){

        }

        public BankBuilder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public BankBuilder setBasicCurrency(Bank.ЕTypeOfCurrency basicCurrency) {
            this.basicCurrency = basicCurrency;
            return this;
        }

        public BankBuilder setBynToUsdExchangeRate(double bynToUsdExchangeRate) {
            this.bynToUsdExchangeRate = bynToUsdExchangeRate;
            return this;
        }

        public BankBuilder setBynToEurExchangeRate(double bynToEurExchangeRate) {
            this.bynToEurExchangeRate = bynToEurExchangeRate;
            return this;
        }

        public BankBuilder setUsdToBynExchangeRate(double usdToBynExchangeRate) {
            this.usdToBynExchangeRate = usdToBynExchangeRate;
            return this;
        }

        public BankBuilder setUsdToEurExchangeRate(double usdToEurExchangeRate) {
            this.usdToEurExchangeRate = usdToEurExchangeRate;
            return this;
        }

        public BankBuilder setEurToBynExchangeRate(double eurToBynExchangeRate) {
            this.eurToBynExchangeRate = eurToBynExchangeRate;
            return this;
        }

        public BankBuilder setEurToUsdExchangeRate(double eurToUsdExchangeRate) {
            this.eurToUsdExchangeRate = eurToUsdExchangeRate;
            return this;
        }

        public BankBuilder setHostBankAccount(double hostBankAccount) {
            this.hostBankAccount = hostBankAccount;
            return this;
        }

        public Bank build(){
            if(bankName == null){
                throw new IllegalArgumentException("Без имени нельзя");
            }
            return new Bank(bankName, basicCurrency, bynToUsdExchangeRate,
                    bynToEurExchangeRate, usdToBynExchangeRate, usdToEurExchangeRate,
                    eurToBynExchangeRate, eurToUsdExchangeRate, hostBankAccount);
        }
    }
}