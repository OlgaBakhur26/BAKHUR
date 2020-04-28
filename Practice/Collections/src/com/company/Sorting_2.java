package com.company;

import javax.swing.event.TreeSelectionEvent;
import java.util.*;

public class Sorting_2 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Set<Car> carSet = new TreeSet<>();

        // заполняем коллекции элементами из метода addElements()
        addElements(carList);
        addElements(carSet);
        System.out.println("неотсортированный carList: " + carList); // List не требует сортировки, поэтому эл-ы
        // добавляются и распечатываются, как надо
        System.out.println("неотсортированный carSet: " + carSet); // TreeSet не работает без указания параметра
        // сортировки в переопределенном методе .compareTo(), ему нужно задать порядок сортировки вручную


        // Сортируем коллекции по возрастанию благодаря методу .compareTo(), переопределенному в классе
        // Car, который реализует Interface Comparable
        Collections.sort(carList); // сортирует всю коллекцию, но если нужно сравнить только 2 объекта, то можно
        // прописать метод .compareTo()

        System.out.println("отсортированный carList: " + carList);
        System.out.println("carSet сортируется автоматически, без метода: " + carSet);


    }

    private static void addElements(Collection collection){ // создали отдельный метод, который принимает объекты
        collection.add(new Car(4444, "Mercedes")); // класса Car и добавляет их в любую коллекцию
        collection.add(new Car(2222, "Ford")); // Не недо каждую новую коллекцию заполнять вручную
        collection.add(new Car(3333, "Lada"));
        collection.add(new Car(1111, "Toyota")); // принимает на вход коллекцию, которую нужно заполнить
    }
}



class Car implements Comparable<Car>{
    private int number;
    private String mark;

    public Car(int number, String mark) {
        this.number = number;
        this.mark = mark;
    }

    @Override // сравнивает текущий объект с другим объектом, а не сортирует весь список, как ComparatOR
    public int compareTo(Car o) {
        if(this.number > o.getNumber()){ // this обозначает "текущий объект"
            return 1; // тут возрастающий порядок
        } else if(this.number < o.getNumber()){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", mark='" + mark + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number &&
                Objects.equals(mark, car.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, mark);
    }

    public int getNumber() {
        return number;
    }

    public String getMark() {
        return mark;
    }


}