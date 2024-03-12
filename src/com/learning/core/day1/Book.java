package com.learning.core.day1;

public class Book {
	private String book_title;
	private double book_price;
	public void setbookprice(double book_price) {
		this.book_price=book_price;
	}
	public void setbooktitle(String book_title) {
		this.book_title=book_title;
	}
	public String getbooktitle() {
		return book_title;
	}
	public double getbookprice() {
		return book_price;
	}

}
