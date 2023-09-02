package com.objects.basics;

public class Book {
	String title;
	String author;
	String catagory;
	int price;
	public Book(String title, String author, String catagory, int price) {
		super();
		this.title = title;
		this.author = author;
		this.catagory = catagory;
		this.price = price;
	}
	
	void getDetails() {
		System.out.println("title-" +title);
		System.out.println("author-"+ author);
		System.out.println("catagory-"+ catagory);
		System.out.println("price-"+price);
	}
	
	void checkBookType() {
	        if(price > 500) {
	            System.out.println("Premium Book");
	        } else {
	            System.out.println("Standard Book");
	        }
	    }
	

}



