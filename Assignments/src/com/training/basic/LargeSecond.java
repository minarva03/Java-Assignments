package com.training.basic;

public class LargeSecond {
	public static void main(String[] args) {
		int[] marks= {5,57,39,78,99,18};
		 int largest=marks[0];
	     int secLarge=marks[0];
	     for (int i = 0; i < marks.length; i++) {
	         if(marks[i]>largest){
	             secLarge=largest;
	             largest=marks[i];
	         }
	         else if(marks[i]>secLarge)
	           secLarge=marks[i];
	     }
	     System.out.println(secLarge);
	}
	
}
