package com.training.basic;

public class GreaterArray {
	
		public static void main(String[] args) {;
			int greater=0;
			int[] numbers= {5,57,39,78,99,18};
			for(int i=0;i<numbers.length-1;i++) {
				greater=numbers[0];
				if(numbers[i]>greater) {
					 greater=numbers[i];
				}
				
			}

			System.out.println(greater);
			
		}
		

}
