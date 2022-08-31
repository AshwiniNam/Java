package com.ashwini.inheritance;

public class Manager extends Employee {
	String[] projects;
	public Manager(int id, String name, String department, double salary,String[] projects) {
		super(id, name, department, salary);
		this.projects = projects;
	}
	
	@Override
	protected void dowork() {
		super.dowork();
		System.out.println("Manager is managing");
		for(String proname:projects)
		{
			System.out.println(proname);
		}
	}
	
}
