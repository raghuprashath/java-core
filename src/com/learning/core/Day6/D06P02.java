package com.learning.core.day6;

import java.util.*;

public class D06P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,PhoneBook> map=new HashMap<>();
		map.put("detail1",new PhoneBook("Amal",998787823l));
		map.put("detail2",new PhoneBook("Manvitha",937843978l));
		map.put("detail3",new PhoneBook("Joseph",7882221113l));
		map.put("detail4",new PhoneBook("Smith",8293893311l));
		map.put("detail5",new PhoneBook("Kathe",7234560011l));
		System.out.println("Enter the Name");
		String name=sc.next();
		for(PhoneBook currentBook: map.values()) {
            String key =currentBook.getName();
            if(key.equals(name)) {
            	System.out.println(currentBook.getPhoneNo());
            }
        }
	}
}
 