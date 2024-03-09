package com.learning.core.day5;

import java.util.*;

public class D05P03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Product> set=new HashSet<>();
		set.add(new Product("P001","Maruti 800"));
		set.add(new Product("P002","Maruti Zen"));
		set.add(new Product("P003","Maruti Dezire"));
		set.add(new Product("P004","Maruti Alto"));
 	 	for(Product currentProduct:set) {
			System.out.println(currentProduct);
		}
	}
}
