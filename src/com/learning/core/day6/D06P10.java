package com.learning.core.day6;


import java.util.*;

public class D06P10 {
	public static void main(String[] args) {
		Hashtable<Integer,Employee> ht=new Hashtable();
		ht.put(1001,new Employee(1001,"Daniel","Analyst","L&D"));
		ht.put(1002,new Employee(1002,"Thomas","Tester","Testing"));
		ht.put(1003,new Employee(1003,"Robert","Product Manager","Development"));
		ht.put(1004,new Employee(1004,"Grace","Tech Support","HR"));
		System.out.println(ht.isEmpty());
	}
}
