package com.training.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<EmployeeList> employeeCities=new ArrayList<>();
		
		List<EmployeeList> employee = Arrays.asList(
                new EmployeeList("minarva",123,"banglore"),
                new EmployeeList("chinmayee",124,"banglore"),
                new EmployeeList("Anisha",125,"hyd"),
                new EmployeeList("Anjani",126,"banglore"),
                new EmployeeList("Ritik",127,"ber"));        
	
	for(EmployeeList emp:employee) {
		if(emp.getCity().equals("banglore")) {
			employeeCities.add(emp);
			System.out.println(emp);
		}
		
	}
  }	
}
