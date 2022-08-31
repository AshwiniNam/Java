package com.ashwini.inheritance;

public class EmpTest {

	public static void main(String[] args) {
		String[] projects = new String[] {"Flight reservation","Check-in"};
		Manager m = new Manager(1,"John","Analytics",19.05,projects);
		System.out.println(m.name);
		System.out.println(m.salary);
		m.dowork();
		
		Developer d = new Developer(2,"Mary","Cyber Security",22.22,"Linux");
		System.out.println(d.name);
		d.dowork();
	}

}
