package com.company;

import java.util.List;
import java.util.Objects;

public class User6 {

    private String firstName6; // field (variable). It is announced at the Class level,
    private String lastName6; // but going to be defined at the local level - in method.

    public String getFullName() {
        return firstName6 + " " + getLastName6();
    }


    public String getFirstName6(){
        return firstName6;
    }

    public String getLastName6(){
        return lastName6.toUpperCase();
    }


    public void setFirstName6(String firstName6) {
        this.firstName6 = firstName6.strip().toLowerCase();
    }

    public void setLastName6(String lastName6) {
        this.lastName6 = lastName6;
    }

    public static void printUsers(List<User6> users){
        for (User6 u: users) {
            System.out.println(u.getFullName());
        }
    }

//    public static int searchList (List<User6>users, String firstName6, String lastName6){
//        return searchList(users, firstName6 + lastName6);
//
//    }
//
//    public static int searchList(List<User6>users, String fullName){
//        for (int i = 0; i < users.size(); i++) {
//            if (users.get(i).getFullName().equals(fullName)){
//                return i;
//            }
//
//        } return -1;
//    }


    @Override
    public String toString() {
        return "User6 [getFullName()=" + getFullName() + "]";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User6 user6 = (User6) o;
        return firstName6.equals(user6.firstName6) &&
                lastName6.equals(user6.lastName6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName6, lastName6);
    }
}
