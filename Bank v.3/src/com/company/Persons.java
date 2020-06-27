package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persons {
    private String personName;
    private static List<Persons> persons = new ArrayList<>();

    public Persons(String personName) {
        this.personName = personName;
        this.persons.add(this);
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public static List<Persons> getPersons() {
        return persons;
    }

    public static void setPersons(List<Persons> persons) {
        Persons.persons = persons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return Objects.equals(personName, persons.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName);
    }


    public static void personalAccounts(List<Accounts> listOfAccounts, List<Persons> persons){

            for (Persons person : Persons.getPersons()) {
                System.out.println(person.getPersonName() + ": ");
                for (Accounts account : Bank.getAccountsList()) {
                    if(account.getAccountHolder().equals(person.getPersonName())){
                        System.out.println("ID счета: " + account.getAccountID() + ", Баланс счета: "
                                + account.getTypeOfCurrency() + " " + account.getAccountBalance());
                    }
                }
            }
            System.out.println();
    }
}
