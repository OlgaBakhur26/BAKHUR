package com.company;

public class User5 {

    private String firstName5; // field (variable). It is announced at the Class level,
    private String lastName5; // but going to be defined at the local level - in method.

    public String getFullName() {
        return firstName5 + " " + getLastName5();
    }


    public String getFirstName5(){
        return firstName5;
    }

    public String getLastName5(){
        return lastName5.toUpperCase();
    }


    public void setFirstName5(String firstName5) {
        this.firstName5 = firstName5.strip().toLowerCase();
    }

    public void setLastName5(String lastName5) {
        this.lastName5 = lastName5;
    }

    public static void printUser(User5 u){
        System.out.println(u.getFullName());
    }


}
