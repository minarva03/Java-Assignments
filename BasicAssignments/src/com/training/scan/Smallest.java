package com.training.scan;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x:");
		int x=sc.nextInt();
		
		System.out.println("enter y:");
		int y=sc.nextInt();
		
		System.out.println("enter z:");
		int z=sc.nextInt();
		
		 if(x<z && x<y) {
				System.out.println("smallest is "+x);
			}
		 else if( y<z) {
			 System.out.println("smallest is "+y);
		 }
		 else {
			 System.out.println("smallest is "+z);
		 }
	}

}
