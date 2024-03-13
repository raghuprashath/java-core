package com.learning.core.day5;

import java.util.*;

public class D05P04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Product> set=new HashSet<>();
		set.add(new Product("P001","Maruti 800"));
		set.add(new Product("P002","Maruti Zen"));
		set.add(new Product("P003","Maruti Dezire"));
		set.add(new Product("P004","Maruti Alto"));
		System.out.println("Enter the product to search:");
		String id =sc.nextLine();
        String name =sc.nextLine();
        int count=0;
        for (Product currentProduct :set) {
            if (currentProduct.getProductId().equals(id) && currentProduct.getProductName().equals(name)) 
            {
                count+=1;;
                break;
            }
        }
        if (count==1) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        	}
	 }
}

