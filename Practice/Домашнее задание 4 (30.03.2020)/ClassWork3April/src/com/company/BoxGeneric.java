package com.company;

import javax.swing.*;

public class BoxGeneric<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }


}

