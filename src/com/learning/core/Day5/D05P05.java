package com.learning.core.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Product2 {
    String productId;
    String productName;

    public Product2(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
    public String toString() {
        return productId + " " + productName;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        return result;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
			return true;
		}
        if (obj == null) {
			return false;
		}
        if (getClass() != obj.getClass()) {
			return false;
		}
        Product other = (Product) obj;
        if (productId == null) {
            if (other.productId != null) {
				return false;
			}
        } else if (!productId.equals(other.productId)) 
        {
			return false;
		}
        return true;
    }
}
public class D05P05 {
	  public static void main(String[] args) {
	        Product2 p1=new Product2("P001","Maruti 800");
			Product2 p2=new Product2("P002","Maruti Zen");
			Product2 p3=new Product2("P003","Maruti Dezire");
			Product2 p4=new Product2("P004","Maruti Alto");
			Set<Product2> s=new HashSet<>();
			s.add(p1);
			s.add(p2);
			s.add(p3);
			s.add(p4);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the product to be removed:");
	        String remove =sc.next();
	        for (Product2 product :s) {
	            if (product.productId.equals(remove)) 
	            {
	                s.remove(product);
	                break;
	            }
	        }
	        for (Product2 product :s) 
	        {
	            System.out.println(product);
	        }
	    }

}