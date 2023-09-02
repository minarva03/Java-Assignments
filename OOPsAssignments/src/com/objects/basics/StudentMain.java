package com.objects.basics;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter student name: ");
         String name= sc.nextLine();

         System.out.print("Enter student department: ");
         String department= sc.nextLine();

         System.out.print("Enter number of subjects: ");
         int n = sc.nextInt();
         int[] marks = new int[n];
         
         for (int subject=0;subject<n; subject++) {
             System.out.print("Enter marks for subject " + (subject+1) + ": ");
             marks[subject] = sc.nextInt();
         }
         Student student = new Student(name, department);
         student.printDetails();
         System.out.println("Grade: " + student.getGrades(marks));

	}

}
