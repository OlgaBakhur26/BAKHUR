package com.company;

public class User4 {

    private String firstName4; // field (variable). It is announced at the Class level,
    private String lastName4; // but going to be defined at the local level - in method.

    public String getFullName() {
        return firstName4 + " " + getLastName4();
    }


    public String getFirstName4(){
        return firstName4;
    }

    public String getLastName4(){
        return lastName4.toUpperCase();
    }


    public void setFirstName4(String firstName4) {
        this.firstName4 = firstName4.strip().toLowerCase();
    }

    public void setLastName4(String lastName4) {
        this.lastName4 = lastName4;
    }
}
