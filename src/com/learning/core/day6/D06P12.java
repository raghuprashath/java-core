package com.learning.core.day6;
import java.util.*;

public class D06P12{
	public static void main(String[] args) {
		Hashtable<Integer,Employee> ht=new Hashtable();
		ht.put(1001,new Employee(1001,"Daniel","Analyst","L&D"));
		ht.put(1002,new Employee(1002,"Thomas","Tester","Testing"));
		ht.put(1003,new Employee(1003,"Robert","Product Manager","Development"));
		ht.put(1004,new Employee(1004,"Grace","Tech Support","HR"));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to add");
		int id=sc.nextInt();
		String name=sc.next();
		String Department=sc.nextLine();
		String Designation=sc.next();
		if(!ht.containsKey(id)){
			ht.put(id, new Employee(id, name, Department, Designation));
		}
		for(Map.Entry<Integer,Employee> e:ht.entrySet()){
			System.out.println(e.getValue());
		}
	}
}
