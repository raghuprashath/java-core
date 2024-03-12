package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book> {
	private int bookId;
	private String title;
	private Date dateOfPublication;
	private String author;
	private double price;
	public Book(int bookId, String title,double price, Date dateOfPublication, String author)
	{
		super();
		this.bookId = bookId;
		this.title = title;
		this.dateOfPublication = dateOfPublication;
		this.author = author;
		this.price=price;
	}
	public int getBookId() {
		return bookId;
	}
	public double getBookPrice() {
		return price;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBookPrice(double price) {
		this.price= price;
	}
	public Date getDateOfPublication() {
		return dateOfPublication;
	}
	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int hashCode() {
		return Objects.hash(author, bookId, dateOfPublication, title);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return this.author.equals(other.author) && this.bookId==other.bookId
				&& this.dateOfPublication.equals(other.dateOfPublication) && this.title.equals(other.title)&&this.price==other.price;
	}
	public String toString() {
		return  bookId + " " + title + " " + author+" "+ dateOfPublication.getDate()+"/"+dateOfPublication.getMonth()+"/"+dateOfPublication.getYear();
		}
	@Override
	public int compareTo(Book o) {
		return this.author.compareTo(o.author);
	}
	
}

