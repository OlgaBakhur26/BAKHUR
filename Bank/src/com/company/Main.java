package com.company;

import java.util.List;
import java.util.Map;

import static com.company.Bank.ЕTypeOfCurrency.*;


public class Main {

    public static void main(String[] args) {

        // 1. Create Banks
        Bank belarusbank = new Bank("Belarusbank", BYN, 0.41d, 0.35d,
                2.3d, 0.87d, 3.3d, 1.1d,
                5_000d);

        Bank mtBank = new Bank("MTBank", BYN, 0.45d, 0.31d,
                2.4d, 0.86d, 3.2d, 1.3d,
                7_000d);

        Bank priorBank = new Bank("Priorbank", BYN, 0.4d, 0.33d,
                2.6d, 0.83d, 3.1d, 1.35d,
                1_000d);

        // 2. Create Persons
        Persons vasia = new Persons("Вася", 11111);
        Persons galia = new Persons("Галя", 22222);
        Persons anzhela = new Persons("Анжела", 33333);
        Persons tolik = new Persons("Толик", 44444);
        Persons roma = new Persons("Рома", 55555);

        // 3. Create accounts
        Accounts vasiaBYNaccount = new Accounts(belarusbank, vasia, BYN, 500);
        Accounts vasiaBYNaccount2 = new Accounts(priorBank, vasia, BYN, 600);
        Accounts vasiaEURaccount = new Accounts(priorBank, vasia, EUR, 1000);
        Accounts galiaBYNaccount = new Accounts(mtBank, galia, BYN, 400);
        Accounts galiaBYNaccount2 = new Accounts(belarusbank, galia, BYN, 400);
        Accounts galiaUSDaccount = new Accounts(belarusbank, galia, USD, 800);
        Accounts anzhelaBYNaccount = new Accounts(priorBank, anzhela, BYN, 7000);
        Accounts anzhelaEURaccount = new Accounts(mtBank, anzhela, EUR, 100);
        Accounts anzhelaEURaccount2 = new Accounts(priorBank, anzhela, EUR, 100);
        Accounts tolikBYNaccount = new Accounts(belarusbank, tolik, BYN, 50);
        Accounts tolikUSDaccount = new Accounts(priorBank, tolik, USD, 150);
        Accounts romaBYNaccount = new Accounts(mtBank, roma, BYN, 750);
        Accounts romaEURaccount = new Accounts(belarusbank, roma, EUR, 5);
        Accounts romaUSDaccount = new Accounts(belarusbank, roma, USD, 200);

        // Произведенные операции перевода средств
        Transfer.transfer(anzhelaEURaccount, romaBYNaccount, mtBank, mtBank, EUR, 10);
        Transfer.transfer(vasiaBYNaccount, galiaUSDaccount, belarusbank, belarusbank, BYN, 2.5);
        Transfer.transfer(vasiaBYNaccount, galiaBYNaccount2, belarusbank, belarusbank, BYN, 25);
        Transfer.transfer(vasiaBYNaccount, romaEURaccount, belarusbank, belarusbank, BYN, 30);
        Transfer.transfer(galiaUSDaccount, tolikBYNaccount, belarusbank, belarusbank, BYN, 30);
        Transfer.transfer(anzhelaEURaccount, romaBYNaccount, mtBank, mtBank, BYN, 70);
        Transfer.transfer(vasiaBYNaccount, galiaUSDaccount, belarusbank, belarusbank, EUR, 1);
        Transfer.transfer(romaBYNaccount, galiaBYNaccount, mtBank, mtBank, EUR, 1);
        Transfer.transfer(romaBYNaccount, anzhelaEURaccount, mtBank, mtBank, EUR, 10);
        Transfer.transfer(tolikUSDaccount, anzhelaBYNaccount, priorBank, priorBank, EUR, 100);
        Transfer.transfer(vasiaEURaccount, anzhelaBYNaccount, priorBank, priorBank, EUR, 2);
        Transfer.transfer(galiaUSDaccount, romaUSDaccount, belarusbank, belarusbank, EUR, 5);
        Transfer.transfer(galiaUSDaccount, romaUSDaccount, belarusbank, belarusbank, BYN, 170);
        Transfer.transfer(galiaUSDaccount, romaUSDaccount, belarusbank, belarusbank, USD, 1000);
        Transfer.transfer(galiaUSDaccount, romaEURaccount, belarusbank, belarusbank, USD, 550);
        Transfer.transfer(galiaUSDaccount, galiaBYNaccount2, belarusbank, belarusbank, USD, 400);
        Transfer.transfer(vasiaEURaccount, anzhelaEURaccount2, priorBank, priorBank, USD, 20);
        Transfer.transfer(vasiaEURaccount, tolikUSDaccount, priorBank, priorBank, USD, 10);
        Transfer.transfer(anzhelaBYNaccount, tolikUSDaccount, priorBank, priorBank, USD, 10);
        Transfer.transfer(anzhelaBYNaccount, vasiaBYNaccount2, priorBank, priorBank, USD, 10);
        Transfer.transfer(anzhelaBYNaccount, anzhelaEURaccount2, priorBank, priorBank, USD, 80);
        Transfer.transfer(vasiaEURaccount, anzhelaEURaccount, priorBank, mtBank, EUR, 3);
        Transfer.transfer(vasiaEURaccount, anzhelaEURaccount, priorBank, mtBank, EUR, 100);
        Transfer.transfer(tolikUSDaccount, romaBYNaccount, priorBank, mtBank, USD, 100);
        Transfer.transfer(romaEURaccount, galiaUSDaccount, priorBank, belarusbank, BYN, 100);
        Transfer.transfer(galiaBYNaccount, tolikUSDaccount, mtBank, priorBank, EUR, 10);

        // Показать информацию о собственных средствах банка, а также о сумме средств на счетах клиентов в разных валютах
        FinancialInfo.displayBankFunds();

        // Показать информацию о средствах клиентов на разных счетах
        FinancialInfo.displayPersonsFunds();

        // Топ банков по количеству денег
        System.out.println("ТОП БАНКОВ ПО КОЛИЧЕСТВУ ДЕНЕГ:");
        Bank.getBanksList().sort(new BanksFundsComporator());
        for (Bank bank : Bank.getBanksList()) {
            System.out.println(bank.getBankName() + ": " + bank.getHostBankAccount());
        }
        System.out.println();

        // Топ банков по количеству операций
        System.out.println("ТОП БАНКОВ ПО КОЛИЧЕСТВУ ОПЕРАЦИЙ:");
        Bank.getBanksList().sort(new OperationsComparator());
        for (Bank bank : Bank.getBanksList()) {
            System.out.println(bank.getBankName() + ": "
                    + (bank.getInOperationsCounter() + bank.getOutOperationsCounter()) + " операций");
        }
    }
}
