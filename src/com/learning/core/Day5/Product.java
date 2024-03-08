package com.learning.core.day5;

public class Product {
    String productId;
    String productName;

    public Product(String productId, String productName)
    {
        this.productId = productId;
        this.productName = productName;
    }
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
    public int hashCode()
    {
        return productId.hashCode();
    }
	public String toString() {
		return productId + " " + productName;
	}
}
