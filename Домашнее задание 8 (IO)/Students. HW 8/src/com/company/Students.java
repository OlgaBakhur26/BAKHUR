package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Students implements Serializable{

    private StringBuilder name;
    private int id;

    public Students(StringBuilder randomName, int randomID){
        this.name = randomName;
        this.id = randomID;
    }

    public StringBuilder getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id &&
                Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

}
