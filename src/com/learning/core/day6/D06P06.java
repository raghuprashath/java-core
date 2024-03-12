package com.learning.core.day6;

import java.util.*;
import java.util.Map.Entry;

public class D06P06 {
	public static void main(String[] args) {
		TreeMap<Car,String> map=new TreeMap<>();
		map.put(new Car("Bugatti",80050.0),"Car1");
		map.put(new Car("Swift",305000.0),"Car2");
		map.put(new Car("Audi",600100.0),"Car3");
		map.put(new Car("Benz",900000.0),"Car4");
		for(Car car:map.descendingKeySet()) {
			System.out.println(car);
		}
	}
}
