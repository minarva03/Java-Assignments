package com.training.basic;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms:");
        int n=sc.nextInt();
        int first=0, sec=1;
        System.out.print(first + "," + sec);
        for(int i=2;i<n;i++){
           int next=first+sec;
           first=sec;
           sec=next;
           System.out.print( "," + next);

        }
	}

}
