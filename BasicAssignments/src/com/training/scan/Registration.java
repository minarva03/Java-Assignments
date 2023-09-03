package com.training.scan;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		String[] userNames= {"minarva","chinmayee","ayushi","anisha","snigdha"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter names to register:");
		String inputName=sc.nextLine();
		boolean namExist=false;
		for(String username:userNames) {
			if(inputName.equals(username)) {
				namExist=true;
			}
		}
			if(namExist) {
				System.out.println("Name is not unoque");
			}
			else {
				System.out.println("You are registered");
			}
		
	}
}
