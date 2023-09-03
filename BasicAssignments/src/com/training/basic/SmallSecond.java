package com.training.basic;

public class SmallSecond {
	public static void main(String[] args) {
		int[] marks= {18,57,5,39,78,99};
		  int smallest=marks[0];
	        int secSmall=marks[0];
	        for (int i = 0; i < marks.length; i++) {
	            if(marks[i]<smallest){
	                secSmall=smallest;
	                smallest=marks[i];
	            }
	            else if(marks[i]>smallest && marks[i]<secSmall){
	                secSmall=marks[i];
	            }
	        }
	        System.out.println(secSmall); 
	  }
	 
	}

