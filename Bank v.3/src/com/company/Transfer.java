package com.company;

public  class Transfer extends Thread{

    Accounts fromAccount;
    Accounts toAccount;
    Bank fromBank;
    Bank toBank;
    double amount;

    @Override
        public void run() {
            Transfer.transfer(fromAccount, toAccount, fromBank, toBank, amount);
        }


    public synchronized static void transfer(Accounts fromAccount, Accounts toAccount,
                                Bank fromBank, Bank toBank, double amount) {
            System.out.println(Thread.currentThread().getName() + " start - " + System.currentTimeMillis());
            double amountToBank1 = fromBank.convert(fromAccount.getTypeOfCurrency(), fromBank.getBasicCurrency(), amount);
            fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amount);
            fromBank.setHostBankAccount(fromBank.getHostBankAccount() + amountToBank1);
            fromBank.setInOperationsCounter(fromBank.getInOperationsCounter() + 1);

            //Комиссия
            if (!fromBank.equals(toBank)){
                if((amount / 100 * 1) < 5){
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() -
                            fromBank.convert(fromBank.getBasicCurrency(), fromAccount.getTypeOfCurrency(), 5));
                    fromBank.setHostBankAccount(fromBank.getHostBankAccount() + 5);
                    fromBank.setInOperationsCounter(fromBank.getInOperationsCounter() + 1);
                }else {
                    fromAccount.setAccountBalance(fromAccount.getAccountBalance() -
                            fromBank.convert(fromBank.getBasicCurrency(), fromAccount.getTypeOfCurrency(), amount / 100 * 1));
                    fromBank.setHostBankAccount(fromBank.getHostBankAccount() + amount / 100 * 1);
                    fromBank.setInOperationsCounter(fromBank.getInOperationsCounter() + 1);
                }
            }

            double amountToBank2 = toBank.convert(fromBank.getBasicCurrency(), toBank.getBasicCurrency(), amountToBank1);
            fromBank.setHostBankAccount(fromBank.getHostBankAccount() - amountToBank1);
            toBank.setHostBankAccount(toBank.getHostBankAccount() + amountToBank2);
            fromBank.setOutOperationsCounter(fromBank.getOutOperationsCounter() + 1);
            toBank.setInOperationsCounter(toBank.getInOperationsCounter() + 1);

            double amountToAccount2 = toBank.convert(toBank.getBasicCurrency(), toAccount.getTypeOfCurrency(), amountToBank2);
            toBank.setHostBankAccount(toBank.getHostBankAccount() - amountToBank2);
            toBank.setOutOperationsCounter(toBank.getOutOperationsCounter() + 1);
            toAccount.setAccountBalance(toAccount.getAccountBalance() + amountToAccount2);
            System.out.println(Thread.currentThread().getName() + " stop - " + System.currentTimeMillis());

    }
}









