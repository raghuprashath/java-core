package com.learning.core.day6;

import java.util.*;

public class Car implements Comparable<Car>{
	private double price;
	private String name;
	public Car(String name,double price) {
		super();
		this.price = price;
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int hashCode() {
		return Objects.hash(name, price);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return this.name.equals(other.name)
				&& this.price==other.price;
	}
	public String toString() {
		return  name + " " + price;
	}
	public int compareTo(Car o) {
		return Double.compare(this.price,o.price);
	}
	
}
