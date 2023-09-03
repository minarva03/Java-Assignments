package com.training.basic;


public class SmallerArray {
	public static void main(String[] args) {
		int smaller=0;
		int[] numbers= {5,57,39,78,99,18};
		for(int i=0;i<numbers.length-1;i++) {
			smaller=numbers[0];
			if(numbers[i]<smaller) {
				 smaller=numbers[i];
			}
		}

		System.out.println(smaller);
	}
}
