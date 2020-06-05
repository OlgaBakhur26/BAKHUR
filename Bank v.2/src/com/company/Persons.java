package com.company;

import java.util.Objects;

public class Persons {
    private String personName;

    public Persons(String personName, int personAccount) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "personName='" + personName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return Objects.equals(personName, persons.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName);
    }
}
