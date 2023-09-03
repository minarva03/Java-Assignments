package com.training.basic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		int i;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter to no to find factorial of nth term:");
	    int n=sc.nextInt();
	    for(i=1;i<=n;i++){
	        fact*=i;
	    }
	    System.out.print("The factorial of "+n + " is " + fact);
	   }

}
