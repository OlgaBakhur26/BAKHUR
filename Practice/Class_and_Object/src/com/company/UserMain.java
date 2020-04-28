package com.company;

public class UserMain {

    public static void main(String[] args) {
	User user = new User();
	user.firstName = "Olga";
	user.lastName = "Bakhur";

        //System.out.println(user.firstName + " " + user.lastName); // ниже в методе

        user.output(2); // the same as higher

        String message = user.output2();
        System.out.println(message);




    }
}
