package com.ashwini.inheritance;

public class Developer extends Employee {
	String technology;
	public Developer(int id, String name, String department, double salary,String technology) {
		super(id, name, department, salary);
		this.technology = technology;
	}
		@Override
		protected void dowork() {
			super.dowork();
			System.out.println("Developer is working using "+ technology);
		}
	
}
