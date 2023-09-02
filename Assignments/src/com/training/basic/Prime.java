package com.training.basic;

import java.util.Scanner;

public class Prime {
	public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check prime:");
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0)
                count++;
            
        }    
        if(count>2)
            System.out.print(num +" is not prime");
        else
        System.out.print(num +" is prime");
	}
}
