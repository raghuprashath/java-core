package com.learning.core.day6;

import java.util.*;

public class D06P07 {
	public static void main(String[] args) {
		TreeMap<Car,String> map=new TreeMap<>();
		map.put(new Car("Bugatti",80050.0),"Car1");
		map.put(new Car("Swift",305000.0),"Car2");
		map.put(new Car("Audi",600100.0),"Car3");
		map.put(new Car("Benz",900000.0),"Car4");
		Map.Entry<Car, String> greatestPrice= map.lastEntry();
		Map.Entry<Car, String> leastPrice= map.firstEntry();
        System.out.println(greatestPrice.getKey());
	    System.out.println(leastPrice.getKey());
	}
}
