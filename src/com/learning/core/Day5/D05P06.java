package com.learning.core.day5;

import java.util.*;
public class D05P06 {
    public static void main(String[] args) {
        Person p1=new Person(1, "Alice", 20, 1500.0);
        Person p2=new Person(2, "Bob", 22, 2000.0);
        Person p3=new Person(3, "Charlie", 19, 2500.0);
        Person p4=new Person(4, "David", 18, 1800.0);
        Person p5=new Person(5, "John", 32, 1999.0);
        Person p6=new Person(6, "Tom", 42, 3999.0);
        Set<Person> p = new TreeSet<Person>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        for (Person person : p) {
            if (person.age > 25) {
                System.out.println(person);
            }
        }
    }
}