package com.shristi.inherdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		
	}
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Virtual ATM");
        System.out.println("Choose Account type:\n1. Savings\n2. Current");
        int choice = sc.nextInt();
        
        
        while(true) {
            System.out.println("Select operation:\n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
            choice = sc.nextInt();
	}

}
