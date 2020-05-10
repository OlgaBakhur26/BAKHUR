package com.company;

public class Boolean1 {
    private String name;
    private String surName;


    public String getName() {
        return name;
    }
    public String getSurName(){
        return surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFullName(){
        return getName() + " " + getSurName();
    }

    public String output(){
        return getFullName();
    }

    public String output (boolean human){
        if (human)
            return "You are a human, " + getFullName();
        else
            return "You are not a human, " + getFullName();
    }



}
