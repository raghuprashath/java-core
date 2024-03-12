package com.learning.core.day6;


import java.util.*;

public class D06P14{
	public static void main(String[] args) {
		Hashtable<Integer,Employee> ht=new Hashtable();
		ht.put(1001,new Employee(1001,"Daniel","Analyst","L&D"));
		ht.put(1002,new Employee(1002,"Thomas","Tester","Testing"));
		ht.put(1003,new Employee(1003,"Robert","Product Manager","Development"));
		ht.put(1004,new Employee(1004,"Grace","Tech Support","HR"));
		TreeMap<Integer,Employee> tm=new TreeMap<>(Collections.reverseOrder());
		tm.put(1005,new Employee(1005,"Charles","QA Lead","Testing"));
		tm.put(1006,new Employee(1006,"Henry","Accountant","Finance"));
		tm.putAll(ht);
		for(Map.Entry<Integer,Employee> newcollection: tm.entrySet()){
			System.out.println(newcollection.getValue());
		}
	}
}
