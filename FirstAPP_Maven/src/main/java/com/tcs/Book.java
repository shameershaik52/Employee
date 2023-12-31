package com.tcs;

public class Book {
	public int bid;
	public String bname;
	public String author;
	public Book(int bid, String bname, String author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + "]";
	}
	

}
