package com.learning.core.day5;

import java.util.*;

public class D05P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> l=new ArrayList<String>();
		l.add("Jack");
		l.add("Paul");
		l.add("Henry");
		l.add("Mary");
		l.add("Ronaldo");
		System.out.println("Enter the Name to be Searched: ");
		String x=sc.next();
		if(l.contains(x)) {
			System.out.println("Found");
		}
		else {
			System.out.println("NotFound");
		}
	}
}
