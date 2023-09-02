package com.training.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		
		List<Employee> employeeCities=new ArrayList<>();
		
		List<Employee> employee = Arrays.asList(
                new Employee("minarva",123,"banglore"),
                new Employee("chinmayee",124,"banglore"),
                new Employee("Anisha",125,"hyd"),
                new Employee("Anjani",126,"banglore"),
                new Employee("Ritik",127,"ber"));        
	
	for(Employee emp:employee) {
		if(emp.getCity().equals("banglore")) {
			employeeCities.add(emp);
			System.out.println(emp);
		}
		
	}
  }	
}
