package com.learning.core.day5;

import java.util.*;


public class D05P04 {
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
        String searchProductId = "P003";
        String searchProductId1 = "Maruti Dezire";
        
        boolean found = false;

        for (Product product :s) {
            if (product.productId.equals(searchProductId) && product.productName.equals(searchProductId1)) 
            {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}