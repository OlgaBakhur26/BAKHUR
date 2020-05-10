package com.company;

import java.util.Date;

public class Person {

    private String nick;
    private String pass;
    private Date registration;

    public Person(String nick, String pass, Date registration) {
        this.nick = nick;
        this.pass = pass;
        this.registration = registration;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", pass='" + pass + '\'' +
                ", registration=" + registration +
                '}';
    }
}
