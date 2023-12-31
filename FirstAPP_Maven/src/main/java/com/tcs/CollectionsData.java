package com.tcs;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsData
{
private List<String> names;
private Set<Integer> pincode;
private Map<String,Integer> wordcount;
private Properties databasepro;
private List<Book>  books;

public CollectionsData(List<String> names, Set<Integer> pincode, Map<String, Integer> wordcount, Properties databasepro,
		List<Book> books) {
	super();
	this.names = names;
	this.pincode = pincode;
	this.wordcount = wordcount;
	this.databasepro = databasepro;
	this.books = books;
}
@Override
public String toString() {
	return "CollectionsData [names=" + names +", \npincode=" + pincode + ",\n wordcount=" + wordcount + ", \ndatabasepro="
			+ databasepro + ",\n books=" + books + "]";
}
public void bookInfo()
{
	for(Book b:books)
	{
		System.out.println(b.bid+" "+b.author+" "+b.bname);
		System.out.println();
	}
	
}
}
