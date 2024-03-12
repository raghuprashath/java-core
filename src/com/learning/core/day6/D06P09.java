package com.learning.core.day6;

import java.util.*;

public class D06P09 {
	public static void main(String[] args) {
		TreeMap<Car,String> map=new TreeMap<>();
		map.put(new Car("Bugatti",80050.0),"Car1");
		map.put(new Car("Swift",305000.0),"Car2");
		map.put(new Car("Audi",600100.0),"Car3");
		map.put(new Car("Benz",900000.0),"Car4");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price");
		double replaceValue=sc.nextDouble();
		String replaceString=sc.next();
		for(Map.Entry<Car,String> temp:map.entrySet()) {
			if(temp.getKey().getPrice()==replaceValue) {
				temp.getKey().setName(replaceString);
			}
		}
		for(Map.Entry<Car,String> updated:map.entrySet()) {
			if(updated.getKey().getPrice()==replaceValue) {
				System.out.println(updated.getKey().getName()+" "+updated.getKey().getPrice());
			}
		}
	}
}
