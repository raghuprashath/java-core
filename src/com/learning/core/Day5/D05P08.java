package com.learning.core.day5;

import java.util.*;

public class D05P08 {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Jerry", 35, 999);
	    Person p2 = new Person(2, "Smith", 48, 2999);
	    Person p3 = new Person(3, "Poppeye", 31, 5999);
	    Person p4 = new Person(4, "Jones", 45, 6999);
	    Person p5 = new Person(5, "John", 32, 1999);
	    Person p6 = new Person(6, "Tom", 42, 3999);
		Set<Person> p=new TreeSet<Person>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		for (Person obj : p)
		{
			String formattedName = obj.name.substring(0, 1).toUpperCase()+ obj.name.substring(1).toLowerCase();
			System.out.println(formattedName);
		}
	}
}