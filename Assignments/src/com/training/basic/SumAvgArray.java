package com.training.basic;

public class SumAvgArray {
	public static void main(String[] args) {
		int[] marks= {5,57,39,78,99,18};
		int sum=0;
		double avg=0;
		int count=0;
		for(int i=0;i<marks.length;i++) {
			count++;
			sum+=marks[i];
			avg=sum/count;		
		}
		System.out.println("The sum is "+sum);
		System.out.println("The avg is "+avg);
		
	}

}
