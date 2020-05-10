package com.company;

public class Main {

    public static void main(String[] args) {
	BoxObject box = new BoxObject();
	box.setItem(123);

	Long item = Long.valueOf(box.getItem().toString());
        System.out.println(item);




    }
}
