package com.training.scan;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number upto which u want to find even number:");
		int number=sc.nextInt();
		
		for(int i=0;i<=number;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
	}

}
