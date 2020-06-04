package com.company;

public  class Transfer {

    public static void transfer(Accounts fromAccount, Accounts toAccount, Bank fromBank, Bank toBank,
                                Bank.ЕTypeOfCurrency type, double amount) {
        // Если не совпадают банки fromBank и toBank
        if (!fromBank.equals(toBank)) {
            double convertedAmount;
            if (type.equals(Bank.ЕTypeOfCurrency.BYN)) {
                convertedAmount = amount * fromBank.getBynToEurExchangeRate(); // amount в Евро
                if (convertedAmount < 5) {
                    double commissionFee1 = 5 * fromBank.getEurToBynExchangeRate(); // commission in Basic currency
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - commissionFee1);
                    fromBank.setHostBankAccount(fromBank.getHostBankAccount() + commissionFee1);
                } else {
                    double commissionFee2 = (convertedAmount / 100 * 1) * fromBank.getEurToBynExchangeRate(); // commission in Basic currency
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - commissionFee2);
                    fromBank.setHostBankAccount(fromBank.getHostBankAccount() + commissionFee2);
                }
                fromBank.setOutOperationsCounter(fromBank.getOutOperationsCounter() + 1);
                toBank.setInOperationsCounter(toBank.getInOperationsCounter() + 1);
            }
            if (type.equals(Bank.ЕTypeOfCurrency.USD)) {
                convertedAmount = amount * fromBank.getUsdToEurExchangeRate();
                if (convertedAmount < 5) {
                    double commissionFee1 = 5 * fromBank.getEurToBynExchangeRate(); // commission in Basic currency
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - commissionFee1);
                    fromBank.setHostBankAccount(fromBank.getHostBankAccount() + commissionFee1);
                } else {
                    double commissionFee2 = (convertedAmount / 100 * 1) * fromBank.getEurToBynExchangeRate(); // commission in Basic currency
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - commissionFee2);
                    fromBank.setHostBankAccount(fromBank.getHostBankAccount() + commissionFee2);
                }
                fromBank.setOutOperationsCounter(fromBank.getOutOperationsCounter() + 1);
                toBank.setInOperationsCounter(toBank.getInOperationsCounter() + 1);
            }
            if (type.equals(Bank.ЕTypeOfCurrency.EUR)) {
                convertedAmount = amount;
                if (convertedAmount < 5) {
                    double commissionFee1 = 5;
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - commissionFee1);
                    fromBank.setHostBankAccount(fromBank.getHostBankAccount() + commissionFee1 * fromBank.getEurToBynExchangeRate());
                } else {
                    double commissionFee2 = (convertedAmount / 100 * 1); // commission in Basic currency
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - commissionFee2);
                    fromBank.setHostBankAccount(fromBank.getHostBankAccount() + commissionFee2 * fromBank.getEurToBynExchangeRate());
                }
                fromBank.setOutOperationsCounter(fromBank.getOutOperationsCounter() + 1);
                toBank.setInOperationsCounter(toBank.getInOperationsCounter() + 1);
            }
        }
            // списание денег с fromAccount
            if (!fromAccount.getTypeOfCurrency().equals(type)) {
                if (fromAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.USD) & type.equals(Bank.ЕTypeOfCurrency.BYN)) {
                    double newAmount = amount * fromBank.getBynToUsdExchangeRate();
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - newAmount);
                }
                if (fromAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.USD) & type.equals(Bank.ЕTypeOfCurrency.EUR)) {
                    double newAmount = amount * fromBank.getEurToUsdExchangeRate();
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - newAmount);
                }
                if (fromAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.BYN) & type.equals(Bank.ЕTypeOfCurrency.USD)) {
                    double newAmount = amount * fromBank.getUsdToBynExchangeRate();
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - newAmount);
                }
                if (fromAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.BYN) & type.equals(Bank.ЕTypeOfCurrency.EUR)) {
                    double newAmount = amount * fromBank.getEurToBynExchangeRate();
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - newAmount);
                }
                if (fromAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.EUR) & type.equals(Bank.ЕTypeOfCurrency.BYN)) {
                    double newAmount = amount * fromBank.getBynToEurExchangeRate();
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - newAmount);
                }
                if (fromAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.EUR) & type.equals(Bank.ЕTypeOfCurrency.USD)) {
                    double newAmount = amount * fromBank.getUsdToEurExchangeRate();
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() - newAmount);
                }
                fromBank.setOutOperationsCounter(fromBank.getOutOperationsCounter() + 1);
            } else {
                fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amount);
                fromBank.setOutOperationsCounter(fromBank.getOutOperationsCounter() + 1);
            }

            // Пополняем счет toAccount
            if (!toAccount.getTypeOfCurrency().equals(type)) {
                if (toAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.USD) & type.equals(Bank.ЕTypeOfCurrency.BYN)) {
                    double newAmount = amount * toBank.getBynToUsdExchangeRate();
                    toAccount.setAccountBalance(toAccount.getAccountBalance() + newAmount);
                }
                if (toAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.USD) & type.equals(Bank.ЕTypeOfCurrency.EUR)) {
                    double newAmount = amount * toBank.getEurToUsdExchangeRate();
                    toAccount.setAccountBalance(toAccount.getAccountBalance() + newAmount);
                }
                if (toAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.BYN) & type.equals(Bank.ЕTypeOfCurrency.USD)) {
                    double newAmount = amount * toBank.getUsdToBynExchangeRate();
                    toAccount.setAccountBalance(toAccount.getAccountBalance() + newAmount); // ok
                }
                if (toAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.BYN) & type.equals(Bank.ЕTypeOfCurrency.EUR)) {
                    double newAmount = amount * toBank.getEurToBynExchangeRate();
                    toAccount.setAccountBalance(toAccount.getAccountBalance() + newAmount); // ok
                }
                if (toAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.EUR) & type.equals(Bank.ЕTypeOfCurrency.BYN)) {
                    double newAmount = amount * toBank.getBynToEurExchangeRate();
                    toAccount.setAccountBalance(toAccount.getAccountBalance() + newAmount);
                }
                if (toAccount.getTypeOfCurrency().equals(Bank.ЕTypeOfCurrency.EUR) & type.equals(Bank.ЕTypeOfCurrency.USD)) {
                    double newAmount = amount * toBank.getUsdToEurExchangeRate();
                    toAccount.setAccountBalance(toAccount.getAccountBalance() + newAmount);
                }
                toBank.setInOperationsCounter(toBank.getInOperationsCounter() + 1);
            } else {
                toAccount.setAccountBalance(toAccount.getAccountBalance() + amount);
                toBank.setInOperationsCounter(toBank.getInOperationsCounter() + 1);
            }
    }
}









