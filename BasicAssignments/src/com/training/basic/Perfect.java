package com.training.basic;

import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check perfect:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum=sum+i; 
        }
        if(sum==num)
        System.out.println(num + " is a perfect number");
	}

}
