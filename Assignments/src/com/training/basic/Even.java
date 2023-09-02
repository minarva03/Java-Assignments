package com.training.basic;

public class Even {
	public static void main(String[] args) {
		int number;
		System.out.println("The even numbers are");
		for(number=1;number<=20;number++) {
			if(number%2==0)
				System.out.println(number);
		}
	}

}
