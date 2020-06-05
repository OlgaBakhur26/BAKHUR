package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinancialInfo {

    // Предположим есть официальный курс валют НБРБ, по которому будет подсчитываться сумма денег в иностранной валюте
    // на счетах разных банков.
    private static final double bynToUsdExchangeRate = 0.4d;
    private static final double bynToEurExchangeRate = 0.33d;
    private static final double usdToBynExchangeRate = 2.5d;
    private static final double usdToEurExchangeRate = 0.88d;
    private static final double eurToBynExchangeRate = 3.0d;
    private static final double eurToUsdExchangeRate = 1.2d;

    // 1. Показать информацию о собственных средствах банка, а также о сумме средств на счетах клиентов в разных валютах
    public static void displayBankFunds(){
        System.out.println("ИНФОРМАЦИЯ О ВСЕХ ДЕНЬГАХ, НАХОДЯЩИХСЯ В БАНКАХ:");
        System.out.println("1. Собственные средства банка, включая комиссию, заработанную с операций:");
        for (Bank bank : Bank.getBanksList()) {
            System.out.println(bank.getBankName() + ": " + bank.getHostBankAccount());
        }
        System.out.println();

        System.out.println("2. Сумма средств на счетах у клиентов банка:");
        for(Map.Entry<String, List<Accounts>> entry : Accounts.getAccountsMap().entrySet()){
            System.out.println(entry.getKey());
            double sumUSD = 0;
            double sumEUR = 0;
            double sumBYN = 0;
            double oneBankTotal = 0;
            for (Accounts account : entry.getValue()) {
                if(account.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.USD)){
                    sumUSD = sumUSD + account.getAccountBalance();
                }
                if(account.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.EUR)){
                    sumEUR = sumEUR + account.getAccountBalance();
                }
                if(account.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.BYN)){
                    sumBYN = sumBYN + account.getAccountBalance();
                }
            }
            System.out.println("В валюте USD: " + sumUSD);
            System.out.println("В валюте EUR: " + sumEUR);
            System.out.println("В валюте BYN: " + sumBYN);

            oneBankTotal = (sumUSD * usdToBynExchangeRate) + (sumEUR * eurToBynExchangeRate) + sumBYN;
            System.out.println("Общая сумма по счетам клиентов в BYN-эквиваленте: " + oneBankTotal);
            System.out.println();
        }
    }

    // 1. Показать информацию о средствах клиентов на разных счетах
    private static Map<String, List<Accounts>> personsFundsMap = new HashMap<>();
    public static void displayPersonsFunds(){
        System.out.println("ИНФОРМАЦИЯ О СРЕДСТВАХ КЛИЕНТОВ НА РАЗНЫХ СЧЕТАХ:");
        for(Map.Entry<String, List<Accounts>> entry : Accounts.getAccountsMap().entrySet()) {
            for (Accounts account : entry.getValue()) {
                if(!personsFundsMap.containsKey(account.getAccountHolder())) {
                    personsFundsMap.put(account.getAccountHolder(), new ArrayList<Accounts>());
                    personsFundsMap.get(account.getAccountHolder()).add(account);
                }else {
                    personsFundsMap.get(account.getAccountHolder()).add(account);
                }
            }
        }

        for(Map.Entry<String, List<Accounts>> entry : FinancialInfo.getPersonsFundsMap().entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Accounts account : entry.getValue()) {
                System.out.println("Название банка: " + account.getBankName());
                System.out.println("ID счета: " + account.getAccountID());
                System.out.println("Валюта счета: " + account.getTypeOfCurrency());
                System.out.println("Сумма на счете: " + account.getAccountBalance());
                System.out.println();
            }
        }
    }

    public double getBynToUsdExchangeRate() {
        return bynToUsdExchangeRate;
    }

    public double getBynToEurExchangeRate() {
        return bynToEurExchangeRate;
    }

    public double getUsdToBynExchangeRate() {
        return usdToBynExchangeRate;
    }

    public double getUsdToEurExchangeRate() {
        return usdToEurExchangeRate;
    }

    public double getEurToBynExchangeRate() {
        return eurToBynExchangeRate;
    }

    public double getEurToUsdExchangeRate() {
        return eurToUsdExchangeRate;
    }

    public static Map<String, List<Accounts>> getPersonsFundsMap() {
        return personsFundsMap;
    }

    public void setPersonsFundsMap(Map<String, List<Accounts>> personsFundsMap) {
        this.personsFundsMap = personsFundsMap;
    }

}
