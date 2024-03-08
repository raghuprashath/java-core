package com.learning.core.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D05P05 {
	  public static void main(String[] args) {
	        Product p1=new Product("P001","Maruti 800");
			Product p2=new Product("P002","Maruti Zen");
			Product p3=new Product("P003","Maruti Dezire");
			Product p4=new Product("P004","Maruti Alto");
			Set<Product> s=new HashSet<>();
			s.add(p1);
			s.add(p2);
			s.add(p3);
			s.add(p4);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the product to be removed:");
	        String remove =sc.next();
	        for (Product product :s) {
	            if (product.productId.equals(remove)) 
	            {
	                s.remove(product);
	                break;
	            }
	        }
	        for (Product product :s) 
	        {
	            System.out.println(product);
	        }
	    }

}