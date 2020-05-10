package com.company;

public class BoxNumber<T extends Number> { // уточняем некоторый круг возможных вариантов
    private T item;

    public Double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }


    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
