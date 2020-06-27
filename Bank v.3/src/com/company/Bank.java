package com.company;

import java.util.*;

public class Bank{

    // Для конструктора
    private String bankName;
    private ЕTypeOfCurrency basicCurrency;
    private double hostBankAccount;
    private int inOperationsCounter;
    private int outOperationsCounter;

    // Другие параметры
    private static List<Bank> banksList = new ArrayList<>();
    private Map<ЕTypeOfCurrency, Map<ЕTypeOfCurrency, Double>> convertors;
    private List<Pair> pairs;
    private static List<Accounts> accountsList;


    // Приватный конструктор
    private Bank(BankBuilder bankBuilder) {
        this.bankName = bankBuilder.bankName;
        this.basicCurrency = bankBuilder.basicCurrency;
        this.hostBankAccount = bankBuilder.hostBankAccount;
        this.convertors = bankBuilder.convertors;
        this.pairs = bankBuilder.pairs;
        this.accountsList = bankBuilder.accountsList;

        for (Pair pair : pairs) {
            Map<ЕTypeOfCurrency, Double> values;
            if(!convertors.containsKey(pair.from)){
                convertors.put(pair.from, values = new HashMap<>());
            } else {
                values = convertors.get(pair.from);
            }

            if(!values.containsKey(pair.to)){
                values.put(pair.to, pair.rate);
            }
        }

        this.inOperationsCounter = bankBuilder.inOperationsCounter;
        this.outOperationsCounter = bankBuilder.outOperationsCounter;
        this.banksList = bankBuilder.banksList;
        this.banksList.add(this);
    }

    public Accounts registration(Persons person, ЕTypeOfCurrency type, double accountBalance){
        Accounts account = new Accounts(person, type, accountBalance);
        this.accountsList.add(account);
        return account;
    }

    public double convert(ЕTypeOfCurrency from, ЕTypeOfCurrency to, double amount){
        return getConvertors().get(from).get(to) * amount;
    }

    // Геттеры
    public String getBankName() {
        return bankName;
    }

    public ЕTypeOfCurrency getBasicCurrency() {
        return basicCurrency;
    }

    public double getHostBankAccount() {
        return hostBankAccount;
    }

    public static List<Accounts> getAccountsList() {
        return accountsList;
    }

    public int getInOperationsCounter() {
        return inOperationsCounter;
    }

    public int getOutOperationsCounter() {
        return outOperationsCounter;
    }

    public Map<ЕTypeOfCurrency, Map<ЕTypeOfCurrency, Double>> getConvertors() {
        return convertors;
    }

    public List<Pair> getPairs() {
        return pairs;
    }

    public static List<Bank> getBanksList() {
        return banksList;
    }


    // Сеттеры
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBasicCurrency(ЕTypeOfCurrency basicCurrency) {
        this.basicCurrency = basicCurrency;
    }

    public void setHostBankAccount(double hostBankAccount) {
        this.hostBankAccount = hostBankAccount;
    }

    public void setInOperationsCounter(int inOperationsCounter) {
        this.inOperationsCounter = inOperationsCounter;
    }

    public void setOutOperationsCounter(int outOperationsCounter) {
        this.outOperationsCounter = outOperationsCounter;
    }

    public void setConvertors(Map<ЕTypeOfCurrency, Map<ЕTypeOfCurrency, Double>> convertors) {
        this.convertors = convertors;
    }

    public void setPairs(List<Pair> pairs) {
        this.pairs = pairs;
    }

    public static void setAccountsList(List<Accounts> accountsList) {
        Bank.accountsList = accountsList;
    }

    public static void setBanksList(List<Bank> banksList) {
        Bank.banksList = banksList;
    }

    @Override
    public String toString() {
        return bankName + ": " + basicCurrency + " " + hostBankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Double.compare(bank.hostBankAccount, hostBankAccount) == 0 &&
                inOperationsCounter == bank.inOperationsCounter &&
                outOperationsCounter == bank.outOperationsCounter &&
                Objects.equals(bankName, bank.bankName) &&
                basicCurrency == bank.basicCurrency &&
                Objects.equals(convertors, bank.convertors) &&
                Objects.equals(pairs, bank.pairs) &&
                Objects.equals(accountsList, bank.accountsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, basicCurrency, hostBankAccount, inOperationsCounter, outOperationsCounter, convertors, pairs, accountsList);
    }

    // Статический вложеный класс
    public static class Pair{
        private ЕTypeOfCurrency from;
        private ЕTypeOfCurrency to;
        private double rate;

        public Pair(ЕTypeOfCurrency from, ЕTypeOfCurrency to, double rate) {
            this.from = from;
            this.to = to;
            this.rate = rate;
        }
    }

    // Статический вложенный класс
    public static class BankBuilder {
        // Для конструктора
        private String bankName;
        private ЕTypeOfCurrency basicCurrency;
        private double hostBankAccount;
        private static List<Accounts> accountsList;
        private int inOperationsCounter;
        private int outOperationsCounter;

        // Другие параметры
        private Map<ЕTypeOfCurrency, Map<ЕTypeOfCurrency, Double>> convertors;
        private List<Pair> pairs;
        private static List<Bank> banksList = new ArrayList<>();

        // Публичный конструктор
        public BankBuilder(){

        }

        // Геттеры
        public String getBankName() {
            return bankName;
        }

        public ЕTypeOfCurrency getBasicCurrency() {
            return basicCurrency;
        }

        public double getHostBankAccount() {
            return hostBankAccount;
        }

        public static List<Accounts> getAccountsList() {
            return accountsList;
        }

        public int getInOperationsCounter() {
            return inOperationsCounter;
        }

        public int getOutOperationsCounter() {
            return outOperationsCounter;
        }

        public Map<ЕTypeOfCurrency, Map<ЕTypeOfCurrency, Double>> getConvertors() {
            return convertors;
        }

        public List<Pair> getPairs() {
            return pairs;
        }

        public static List<Bank> getBanksList() {
            return banksList;
        }

        // Сеттеры
        public BankBuilder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public BankBuilder setBasicCurrency(ЕTypeOfCurrency basicCurrency) {
            this.basicCurrency = basicCurrency;
            return this;
        }

        public BankBuilder setHostBankAccount(double hostBankAccount) {
            this.hostBankAccount = hostBankAccount;
            return this;
        }

        public BankBuilder setAccountsList(List<Accounts> accountsList) { // Как сделать static метод?
            this.accountsList = accountsList;
            return this;
        }

        public BankBuilder setInOperationsCounter(int inOperationsCounter) {
            this.inOperationsCounter = inOperationsCounter;
            return this;
        }

        public BankBuilder setOutOperationsCounter(int outOperationsCounter) {
            this.outOperationsCounter = outOperationsCounter;
            return this;
        }

        public BankBuilder setConvertors(Map<ЕTypeOfCurrency, Map<ЕTypeOfCurrency, Double>> convertors) {
            this.convertors = convertors;
            return this;
        }

        public BankBuilder setPairs(List<Pair> pairs) {
            this.pairs = pairs;
            return this;
        }

        public BankBuilder setBanksList(List<Bank> banksList) { // Как сделать static метод?
            this.banksList = banksList;
            return this;
        }

        // Метод build()
        public Bank build(){
            if(bankName == null){
                throw new IllegalArgumentException("Нельзя создать банк без имени");
            }
            return new Bank(this);
        }
    }
}