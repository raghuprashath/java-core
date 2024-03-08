package com.learning.core.day5;

import java.util.*;

public class D05P10 {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Alice", 30,1999);
        Person p2 = new Person(2, "Bob", 25, 3999);
        Person p3 = new Person(3, "Charlie", 35,999);
        Person p4 = new Person(4, "David", 20, 6999);
        Person p5 = new Person(5, "Eve", 28, 5999);
        Person p6 = new Person(6, "Frank", 40, 2999);
        Set<Person> p = new TreeSet<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        for (Person obj : p) {
            if (obj.name.startsWith("J")) {
                System.out.println("id=" +obj.id + ",name="+obj.name+ ",age="+ obj.age+ ",Salary=" +obj.salary);
                break;
            }
        }
    }
}