package com.learning.core.day5;


import java.util.*;

public class D05P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array List");
		int n=sc.nextInt();
		List<String> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		System.out.println("Enter the Element to Search");
		String search=sc.next();
		if(list.contains(search)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
