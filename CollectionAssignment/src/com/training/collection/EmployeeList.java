package com.training.collection;

public class EmployeeList {

	String name;
	int employeeId;
	String city;
	public EmployeeList(String name, int employeeId, String city) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.city = city;
	}
	public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", employeeId=" + employeeId + ", city=" + city + "]";
    }


}
