package com.objects.basics;

 class BookMain {

	public static void main(String[] args) {
		
		Book book=new Book("The White Tiger","Aravind Adiga","Fiction",399);
		book.getDetails();
		book.checkBookType();
		
		Book book1=new Book("The Discovery of India","Jawaharlal Nehru","History",500);
		book1.getDetails();
		book1.checkBookType();
	}

}
