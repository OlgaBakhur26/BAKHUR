package com.company;

public class User2 {

    private String firstName2; // field (variable). It is announced at the Class level,
    private String lastName2; // but going to be defined at the local level - in method.

    public String getFullName() {
        return firstName2 + " " + getLastName2();
    }


    public String getFirstName2(){
        return firstName2;
    }

    public String getLastName2(){
        return lastName2.toUpperCase();
    }


    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2.strip().toLowerCase();
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }





}
