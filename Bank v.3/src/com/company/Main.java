package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.company.ЕTypeOfCurrency.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // 1. Создать курсы валют (Pairs) для каждого банка
        List<Bank.Pair> ratesBelarusbank = new ArrayList<>();
        Bank.Pair bynUSDbelarusbank = new Bank.Pair(BYN, USD, 0.5);
        Bank.Pair usdBYNbelarusbank = new Bank.Pair(USD, BYN, 2);
        Bank.Pair bynEURbelarusbank = new Bank.Pair(BYN, EUR, 0.33);
        Bank.Pair eurBYNbelarusbank = new Bank.Pair(EUR, BYN, 3);
        Bank.Pair bynBYNbelarusbank = new Bank.Pair(BYN, BYN, 1);
        ratesBelarusbank.add(bynUSDbelarusbank);
        ratesBelarusbank.add(usdBYNbelarusbank);
        ratesBelarusbank.add(bynEURbelarusbank);
        ratesBelarusbank.add(eurBYNbelarusbank);
        ratesBelarusbank.add(bynBYNbelarusbank);

        List<Bank.Pair> ratesMTBank = new ArrayList<>();
        Bank.Pair bynUSDmtBank = new Bank.Pair(BYN, USD, 0.4);
        Bank.Pair usdBYNmtBank = new Bank.Pair(USD, BYN, 2.1);
        Bank.Pair bynEURmtBank = new Bank.Pair(BYN, EUR, 0.35);
        Bank.Pair eurBYNmtBank = new Bank.Pair(EUR, BYN, 3.2);
        Bank.Pair bynBYNmtBank = new Bank.Pair(BYN, BYN, 1);
        ratesMTBank.add(bynUSDmtBank);
        ratesMTBank.add(usdBYNmtBank);
        ratesMTBank.add(bynEURmtBank);
        ratesMTBank.add(eurBYNmtBank);
        ratesMTBank.add(bynBYNmtBank);

        List<Bank.Pair> ratesPriorBank= new ArrayList<>();
        Bank.Pair bynUSDpriorBank = new Bank.Pair(BYN, USD, 0.6);
        Bank.Pair usdBYNpriorBank = new Bank.Pair(USD, BYN, 1.9);
        Bank.Pair bynEURpriorBank = new Bank.Pair(BYN, EUR, 2.90);
        Bank.Pair eurBYNpriorBank = new Bank.Pair(EUR, BYN, 2.9);
        Bank.Pair bynBYNpriorBank = new Bank.Pair(BYN, BYN, 1);
        ratesPriorBank.add(bynUSDpriorBank);
        ratesPriorBank.add(usdBYNpriorBank);
        ratesPriorBank.add(bynEURpriorBank);
        ratesPriorBank.add(eurBYNpriorBank);
        ratesPriorBank.add(bynBYNpriorBank);

        // 2. Создать банки
        Bank belarusbank = new Bank.BankBuilder()
                .setBankName("Belarusbank")
                .setBasicCurrency(BYN)
                .setHostBankAccount(500_000)
                .setInOperationsCounter(0)
                .setOutOperationsCounter(0)
                .setPairs(ratesBelarusbank)
                .setConvertors(new HashMap<>())
                .setAccountsList(new ArrayList<>())
                .build();

        Bank mtBank = new Bank.BankBuilder()
                .setBankName("MTBank")
                .setBasicCurrency(BYN)
                .setHostBankAccount(600_000)
                .setInOperationsCounter(0)
                .setOutOperationsCounter(0)
                .setPairs(ratesBelarusbank)
                .setConvertors(new HashMap<>())
                .setAccountsList(new ArrayList<>())
                .build();

        Bank priorBank = new Bank.BankBuilder()
                .setBankName("Priorbank")
                .setBasicCurrency(BYN)
                .setHostBankAccount(700_000)
                .setInOperationsCounter(0)
                .setOutOperationsCounter(0)
                .setPairs(ratesBelarusbank)
                .setConvertors(new HashMap<>())
                .setAccountsList(new ArrayList<>())
                .build();

        // 3. Создать пользователей
        Persons vasia = new Persons("Вася");
        Persons galia = new Persons("Галя");
        Persons anzhela = new Persons("Анжела");
        Persons tolik = new Persons("Толик");
        Persons roma = new Persons("Рома");

        // 4. Создать и зарегистрировать аккаунты в банках
        Accounts vasiaBYNaccount = belarusbank.registration(vasia, BYN, 500);;
        Accounts vasiaBYNaccount2 = priorBank.registration(vasia, BYN, 600);
        Accounts vasiaEURaccount = priorBank.registration(vasia, EUR, 1000);
        Accounts galiaBYNaccount = mtBank.registration(galia, BYN, 400);
        Accounts galiaBYNaccount2 = belarusbank.registration(galia, BYN, 400);
        Accounts galiaUSDaccount = belarusbank.registration(galia, USD, 800);
        Accounts anzhelaBYNaccount = priorBank.registration(anzhela, BYN, 7000);
        Accounts anzhelaEURaccount = mtBank.registration(anzhela, EUR, 100);
        Accounts anzhelaEURaccount2 = priorBank.registration(anzhela, EUR, 100);
        Accounts tolikBYNaccount = belarusbank.registration(tolik, BYN, 50);
        Accounts tolikUSDaccount = priorBank.registration(tolik, USD, 150);
        Accounts romaBYNaccount = mtBank.registration(roma, BYN, 750);
        Accounts romaEURaccount = belarusbank.registration(roma, EUR, 5);
        Accounts romaUSDaccount = belarusbank.registration(roma, USD, 200);

        // Произвести операции перевода средств
        Transfer t1 = new Transfer();
        t1.fromAccount = anzhelaEURaccount;
        t1.toAccount = romaBYNaccount;
        t1.fromBank = mtBank;
        t1.toBank = mtBank;
        t1.amount = 10;

        Transfer t2 = new Transfer();
        t2.fromAccount = vasiaBYNaccount;
        t2.toAccount = galiaUSDaccount;
        t2.fromBank = belarusbank;
        t2.toBank = belarusbank;
        t2.amount = 2.5;

        Transfer t3 = new Transfer();
        t3.fromAccount = vasiaBYNaccount;
        t3.toAccount = galiaBYNaccount2;
        t3.fromBank = belarusbank;
        t3.toBank = belarusbank;
        t3.amount = 25;

        Transfer t4 = new Transfer();
        t4.fromAccount = galiaBYNaccount2;
        t4.toAccount = romaEURaccount;
        t4.fromBank = belarusbank;
        t4.toBank = belarusbank;
        t4.amount = 30;

        Transfer t5 = new Transfer();
        t5.fromAccount = galiaUSDaccount;
        t5.toAccount = tolikBYNaccount;
        t5.fromBank = belarusbank;
        t5.toBank = belarusbank;
        t5.amount = 30;

        Transfer t6 = new Transfer();
        t6.fromAccount = anzhelaEURaccount;
        t6.toAccount = romaBYNaccount;
        t6.fromBank = mtBank;
        t6.toBank = mtBank;
        t6.amount = 70;

        Transfer t7 = new Transfer();
        t7.fromAccount = vasiaBYNaccount;
        t7.toAccount = galiaUSDaccount;
        t7.fromBank = belarusbank;
        t7.toBank = belarusbank;
        t7.amount = 1;

        Transfer t8 = new Transfer();
        t8.fromAccount = romaBYNaccount;
        t8.toAccount = galiaBYNaccount;
        t8.fromBank = mtBank;
        t8.toBank = mtBank;
        t8.amount = 1;

        Transfer t9 = new Transfer();
        t9.fromAccount = tolikUSDaccount;
        t9.toAccount = anzhelaBYNaccount;
        t9.fromBank = priorBank;
        t9.toBank = priorBank;
        t9.amount = 100;

        Transfer t10 = new Transfer();
        t10.fromAccount = vasiaEURaccount;
        t10.toAccount = anzhelaEURaccount;
        t10.fromBank = priorBank;
        t10.toBank = mtBank;
        t10.amount = 3;

        Transfer t11 = new Transfer();
        t11.fromAccount = vasiaEURaccount;
        t11.toAccount = anzhelaEURaccount;
        t11.fromBank = priorBank;
        t11.toBank = mtBank;
        t11.amount = 100;

        Transfer t12 = new Transfer();
        t12.fromAccount = tolikUSDaccount;
        t12.toAccount = romaBYNaccount;
        t12.fromBank = priorBank;
        t12.toBank = mtBank;
        t12.amount = 100;

        Transfer t13 = new Transfer();
        t13.fromAccount = romaEURaccount;
        t13.toAccount = galiaUSDaccount;
        t13.fromBank = priorBank;
        t13.toBank = belarusbank;
        t13.amount = 100;

        Transfer t14 = new Transfer();
        t14.fromAccount = galiaBYNaccount;
        t14.toAccount = tolikUSDaccount;
        t14.fromBank = mtBank;
        t14.toBank = priorBank;
        t14.amount = 10;

        Transfer t15 = new Transfer();
        t15.fromAccount = romaUSDaccount;
        t15.toAccount = vasiaBYNaccount2;
        t15.fromBank = belarusbank;
        t15.toBank = priorBank;
        t15.amount = 500;

        Transfer t16 = new Transfer();
        t16.fromAccount = anzhelaEURaccount2;
        t16.toAccount = galiaBYNaccount;
        t16.fromBank = priorBank;
        t16.toBank = mtBank;
        t16.amount = 200;

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
        t11.join();
        t12.join();
        t13.join();
        t14.join();
        t15.join();
        t16.join();
        System.out.println();

//        Transfer.transfer(anzhelaEURaccount, romaBYNaccount, mtBank, mtBank, 10);
//        Transfer.transfer(vasiaBYNaccount, galiaUSDaccount, belarusbank, belarusbank, 2.5);
//        Transfer.transfer(vasiaBYNaccount, galiaBYNaccount2, belarusbank, belarusbank,25);
//        Transfer.transfer(galiaBYNaccount2, romaEURaccount, belarusbank, belarusbank,30);
//        Transfer.transfer(galiaUSDaccount, tolikBYNaccount, belarusbank, belarusbank,30);
//        Transfer.transfer(anzhelaEURaccount, romaBYNaccount, mtBank, mtBank,70);
//        Transfer.transfer(vasiaBYNaccount, galiaUSDaccount, belarusbank, belarusbank,1);
//        Transfer.transfer(romaBYNaccount, galiaBYNaccount, mtBank, mtBank,1);
//        Transfer.transfer(romaBYNaccount, anzhelaEURaccount, mtBank, mtBank,10);
//        Transfer.transfer(tolikUSDaccount, anzhelaBYNaccount, priorBank, priorBank,100);
//        Transfer.transfer(vasiaEURaccount, anzhelaEURaccount, priorBank, mtBank,3);
//        Transfer.transfer(vasiaEURaccount, anzhelaEURaccount, priorBank, mtBank,100);
//        Transfer.transfer(tolikUSDaccount, romaBYNaccount, priorBank, mtBank,100);
//        Transfer.transfer(romaEURaccount, galiaUSDaccount, priorBank, belarusbank,100);
//        Transfer.transfer(galiaBYNaccount, tolikUSDaccount, mtBank, priorBank, 10);

        System.out.println("1. Собственные средства банков, включая заработанную комиссию:".toUpperCase());
        for (Bank bank : Bank.getBanksList()) {
            System.out.println(bank);
        }
        System.out.println();

        System.out.println("2. Информация о счетах клиентов в разных банках:".toUpperCase());
        Persons.personalAccounts(Bank.getAccountsList(), Persons.getPersons());

        System.out.println("3. ТОП БАНКОВ ПО КОЛИЧЕСТВУ СОБСТВЕННЫХ ДЕНЕГ:");
        Bank.getBanksList().sort(new BanksFundsComporator());
        for (Bank bank : Bank.getBanksList()) {
            System.out.println(bank.getBankName() + ": " + bank.getHostBankAccount());
        }
        System.out.println();

        System.out.println("4. ТОП БАНКОВ ПО КОЛИЧЕСТВУ ОПЕРАЦИЙ:");
        Bank.getBanksList().sort(new OperationsComparator());
        for (Bank bank : Bank.getBanksList()) {
            System.out.println(bank.getBankName() + ": "
                    + (bank.getInOperationsCounter() + bank.getOutOperationsCounter()) + " операций");
        }
    }
}
