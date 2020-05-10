package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Students implements Serializable {


    private StringBuilder name;
    private int mark;

    public Students(StringBuilder randomName, int randomMark) {
        this.name = randomName;
        this.mark = randomMark;
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder randomName) {
        this.name = randomName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int randomMark) {
        this.mark = randomMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return mark == students.mark &&
                Objects.equals(name, students.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name=" + name +
                ", mark=" + mark +
                '}';
    }
}
