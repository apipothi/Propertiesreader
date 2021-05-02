package com.apipothi.propertiesreader.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bookservice {

	@Value("${apipothi.bookdescription}")
	private String bookdescription;
	
	@Value("${apipothi.bookid}")
	private int[] bookidarray;
	
	@Value("${apipothi.bookprice}")
	private List<Integer> bookpricelist;
	
	
	@Value("${apipothi.booksname}")
	private Set<String> booksnameset;
	
	@Value("#{${apipothi.bookswithprice}}")
	private Map<String,Integer> valuemap;

	@Value("#{${apipothi.bookswithauthor}}")
	private Map<String,String> valuemap2;

	@Value("${apipothi.booknotabalable}")
	private boolean booknotabalable;

	public void getFromProperties() {

		System.out.println("*Start-Bookservice**-getFromProperties()-***");
		
		System.out.println("Description - " + bookdescription);
		
		System.out.println("Book ID as Integer Array - " + Arrays.toString(bookidarray));
		
		System.out.println("Book Price as Integer List - " + bookpricelist);
		
		System.out.println("Book Name as String Set - " + booksnameset);

		System.out.println("Book Details as String Map - " + valuemap);
		
		System.out.println("Book Details as String Map - " + valuemap2);
		
		System.out.println("Book abalable  as String boolean - " + booknotabalable);
		
		System.out.println("*End-Bookservice**-getFromProperties()-***");
	}

}
