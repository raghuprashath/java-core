package com.learning.core.day5;

import java.util.*;

public class D05P03 {
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
		for(Product details:s) {
			System.out.println(details);
		}
	}
}
class Product {
	String productName;
	String productId;
	public Product(String productName,String productId) {
		this.productId=productId;
		this.productName=productName;
	}
	public String toString() {
		return  productName + " " + productId;
	}
	public int hashCode() {
        return productId.hashCode();
    }
	public boolean equals(Object obj) {
        if (this == obj) {
        	return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
        	return false;
        }
        Product p = (Product) obj;
        return productId.equals(p.productId);
    }
	
}

