package com.ashwini.inheritance;

public class Tester extends Employee {
	String[] tools;
	public Tester(int id, String name, String department, double salary,String[] tools) {
		super(id, name, department, salary);
		this.tools = tools;
	}
	
	@Override
	protected void dowork() {
		super.dowork();
		System.out.println("Tester is testing using");
		for(String proname:tools)
		{
			System.out.println(proname);
		}
	}
	
}
