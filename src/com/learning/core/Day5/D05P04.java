package com.learning.core.day5;

import java.util.HashSet;
import java.util.Set;

class Product1{
    String productId;
    String productName;

    public Product1(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
    public int hashCode() {
        return productId.hashCode();
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
}
public class D05P04 {
    public static void main(String[] args) {
    	Product1 p1=new Product1("P001","Maruti 800");
		Product1 p2=new Product1("P002","Maruti Zen");
		Product1 p3=new Product1("P003","Maruti Dezire");
		Product1 p4=new Product1("P004","Maruti Alto");
		Set<Product1> s=new HashSet<>();
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
        String searchProductId = "P003";
        String searchProductId1 = "Maruti Dezire";
        
        boolean found = false;

        for (Product1 product :s) {
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