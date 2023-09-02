package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] userNames= {"minarva","chinmayee","ayushi","anisha","snigdha"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username to login:");
		String inputName=sc.nextLine();
		boolean namExist=false;
		for(String username:userNames) {
			if(inputName.equals(username)) {
				namExist=true;
			}
		}
			if(namExist) {
				System.out.println("You are logged in successfully");
			}
			else {
				System.out.println("Invalid username");
			}
		
	}

	

}
