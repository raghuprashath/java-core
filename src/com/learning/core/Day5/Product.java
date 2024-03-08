package com.learning.core.day5;

public class Product {
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
