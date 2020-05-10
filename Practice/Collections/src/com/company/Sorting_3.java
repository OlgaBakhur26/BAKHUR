package com.company;

import java.util.*;

public class Sorting_3 {
    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();
        Set<Students> studentsSet = new TreeSet<>();

        addStudents(studentsList);
        addStudents(studentsSet);

        Collections.sort(studentsList);

        System.out.println(studentsList);
        System.out.println(studentsSet);

        // В порядке возрастания оценок по литературе.
        // [Students{name='Afonasiy', math=6, literature=4, physics=8}, Students{name='Anna', math=5, literature=5, physics=7}, Students{name='Bob', math=7, literature=9, physics=3}, Students{name='Denis', math=3, literature=10, physics=6}]
        //[Students{name='Afonasiy', math=6, literature=4, physics=8}, Students{name='Anna', math=5, literature=5, physics=7}, Students{name='Bob', math=7, literature=9, physics=3}, Students{name='Denis', math=3, literature=10, physics=6}]
// В Set такое класть нельзя, а то все люди с одинаковыми оценками поудаляются

    }

    private static void addStudents(Collection collection){
        collection.add(new Students("Bob", 7, 9, 3));
        collection.add(new Students("Anna", 5, 5, 7));
        collection.add(new Students("Denis", 3, 10, 6));
        collection.add(new Students("Afonasiy", 6, 4, 8));
    }


}

// Отсортировать учеников по успеваемости
class Students implements Comparable<Students>{
    private String name;
    private int math;
    private int literature;
    private int physics;


    @Override
    public int compareTo(Students o) {
        if(this.literature > o.getLiterature()){ // this обозначает "текущий объект"
            return 1; // тут возрастающий порядок
        } else if(this.literature < o.getLiterature()){
            return -1;
        } else {
            return 0;
        }
    }


    public Students(String name, int math, int literature, int physics) {
        this.name = name;
        this.math = math;
        this.literature = literature;
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", math=" + math +
                ", literature=" + literature +
                ", physics=" + physics +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return math == students.math &&
                literature == students.literature &&
                physics == students.physics &&
                Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, math, literature, physics);
    }

    public String getName() {
        return name;
    }

    public int getMath() {
        return math;
    }

    public int getLiterature() {
        return literature;
    }

    public int getPhysics() {
        return physics;
    }


}

