package com.company;

import java.util.Objects;

public class Passport {
    private String name;
    private String id;
    private int age;

    public Passport(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) { // благодаря этому остаются только уникальные элементы по уникальному ID
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return id.equals(passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
