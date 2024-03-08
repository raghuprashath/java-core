package com.learning.core.day5;

import java.util.*;
class Person implements Comparable<Person> {
    int id;
    String name;
    int age;
    double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return id == person.id;
    }
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
    public String toString() {
        return id+" "+name+" "+age+" "+salary;
    }
}