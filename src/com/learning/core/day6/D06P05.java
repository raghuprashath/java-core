package com.learning.core.day6;

import java.util.*;
import java.util.Map.Entry;

public class D06P05 {
	public static void main(String[] args) {
		Map<String,Car> map=new TreeMap<>();
		map.put("Car1",new Car("Bugatti",80050.0));
		map.put("Car2",new Car("Swift",305000.0));
		map.put("Car3",new Car("Audi",600100.0));
		map.put("Car4",new Car("Benz",900000.0));
		for(Car car:map.values()) {
			System.out.println(car);
		}
	}
}
