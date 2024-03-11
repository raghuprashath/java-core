package com.learning.core.day6;

import java.util.*;

public class D06P03 {
	public static void main(String[] args) {
		TreeSet<Book> set=new TreeSet<>();
		set.add(new Book(1001,"Python Learning",715.0,new Date(2020,2,2),"Martin C.Brown"));
		set.add(new Book(1002,"Modern Mainframe",295.0,new Date(1997,5,19),"Sharad"));
		set.add(new Book(1003,"Java Programming",523.0,new Date(1984,11,23),"Gilad Bracha"));
		set.add(new Book(1004,"Read C++",295.0,new Date(1984,11,19),"Henry Harvin"));
		set.add(new Book(1005,".Net Platform",3497.0,new Date(1984,3,6),"Mark J Price"));
		for(Book currentbook:set) {
			System.out.println(currentbook);
		}
	}
}
