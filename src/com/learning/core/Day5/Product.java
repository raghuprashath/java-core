package com.learning.core.day5;

public class Product {
	private String productId;
	private String ProductName;
	
	public Product(String productId, String productName) {
		this.productId = productId;
		this.ProductName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String toString() {
		return productId + " " + ProductName;
	}
	public int hashCode() {
		return productId.hashCode();
	}
	   public boolean equals(Object obj)
	    {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	            }
	        Product currentobj= (Product) obj;
	        	return productId.equals(currentobj.productId);
	    }
	
}
