package com.training.scan;

import java.util.Scanner;

public class OneDim {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Get the number of elements from the user
        System.out.print("Enter the number of elements you want in the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        double[] squareRoots = new double[n];
        for (int i = 0; i < n; i++) {
            squareRoots[i] = Math.sqrt(numbers[i]);
        }
        
        // Print the new array
        System.out.println("Square roots of the numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Square root of " + numbers[i] + " = " + squareRoots[i]);
        }
	}
}
