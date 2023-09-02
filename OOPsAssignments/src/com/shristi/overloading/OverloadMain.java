package com.shristi.overloading;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 for(int employee=0; employee<3; employee++) {
			 
		 }
	            System.out.println("Enter details for Employee ");

	            System.out.print("Enter employee name: ");
	            String name = sc.nextLine();
	            
	            System.out.print("Enter employee designation: ");
	            String designation = sc.nextLine();
	            
	            Employee employee=new Employee(name,designation);
	            
	            if(designation.toLowerCase()=="programmer") {
	            	 System.out.print("Enter basic allowance: ");
	                    double basicAllowance = sc.nextDouble();
	                    sc.nextLine();
	                    System.out.println("Bonus: " + employee.calcBonus(basicAllowance));
	            }
	            else if(designation=="manager") {
	            	 System.out.print("Enter basic allowance: ");
	                    double basicAllowance = sc.nextDouble();
	                    System.out.print("Enter car allowance: ");
	                    double carAllowance = sc.nextDouble();
	                    sc.nextLine();
	                    System.out.println("Bonus: " + employee.calcBonus(basicAllowance, carAllowance));    
	            }
	            else if(designation=="director") {
	            	 System.out.print("Enter basic allowance: ");
	                    double basicAllowance = sc.nextDouble();
	                    System.out.print("Enter car allowance: ");
	                    double carAllowance = sc.nextDouble();
	                    System.out.print("Enter house allowance: ");
	                    double houseAllowance = sc.nextDouble();
	                    sc.nextLine();
	                    System.out.println("Bonus: " + employee.calcBonus(basicAllowance, carAllowance, houseAllowance));
	            }
	            else {
	            	System.out.println("....");
	            }
	            
	}

}
