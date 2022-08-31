package com.ashwini.inheritance;

public class Employee {
	int id;
	String name;
	String department;
	double salary;
	
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	protected void dowork() {
		System.out.println("Mark attendance");
	}
}
