package com.learning.core.day1;

public class D01P01 {
	public static Book createBooks() {
		Book java=new Book();
		java.setbookprice(350.00);
		java.setbooktitle("Java Programming");
		return java;
	}
	public static void showBooks(Book b) {
		System.out.println("Book title: " + b.getbooktitle() +" and Price: "+ b.getbookprice());
	}
	public static void main(String[] args){
		showBooks(createBooks());
   }
}
