package com.shristi.overloading;

public class Employee {
	String name;
	String designation;
	

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}


//	double calcBonus(double allowance) {
//		
//	}
	double calcBonus(double basicAllowance) {
		return basicAllowance * 0.1;
	}
	double calcBonus(double basicAllowance, double carAllowance) {
		return (basicAllowance + carAllowance) * 0.15;
	}
    double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
    	return (basicAllowance + carAllowance + houseAllowance) * 0.2;
    }

}
