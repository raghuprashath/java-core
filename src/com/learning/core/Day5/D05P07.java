package com.learning.core.day5;

import java.util.*;

public class D05P07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Person> set=new TreeSet<>();
		set.add(new Person(1, "Jerry", 20, 999.0));
		set.add(new Person(2, "Smith", 19, 2999.0));
		set.add(new Person(3, "Popeye", 21, 5999.0));
		set.add(new Person(4, "Jones", 22, 6999.0));
		set.add(new Person(5, "John", 32, 1999.0));
		set.add(new Person(6, "Tom", 42, 3999.0));
		for(Person currentPerson:set) {
				System.out.println(currentPerson.display());
		}
	}
}
