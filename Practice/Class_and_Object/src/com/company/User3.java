package com.company;

public class User3 {

    private String firstName3; // field (variable). It is announced at the Class level,
    private String lastName3; // but going to be defined at the local level - in method.

    public String getFullName() {
        return firstName3 + " " + getLastName3();
    }


    public String getFirstName3(){
        return firstName3;
    }

    public String getLastName3(){
        return lastName3.toUpperCase();
    }


    public void setFirstName3(String firstName3) {
        this.firstName3 = firstName3.strip().toLowerCase();
    }

    public void setLastName3(String lastName3) {
        this.lastName3 = lastName3;
    }
}
