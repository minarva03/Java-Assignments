package com.training.scan;

import java.util.Scanner;

public class Greatest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x:");
		int x=sc.nextInt();
		
		System.out.println("enter y:");
		int y=sc.nextInt();
		
		System.out.println("enter z:");
		int z=sc.nextInt();
		
		System.out.println("greatest element among 3 is:");
		 int greatest=(x>y) && (x>z)?x:y>z?y:z;
		 System.out.println(greatest);
	}

}
