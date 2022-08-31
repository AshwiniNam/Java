package com.emc.test;
import  com.emc.entities.*;
public class Test {
	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.id = 333;
		organizer.name = "Google";
		System.out.println(organizer.name + " organizes");
		
		Event event = new Event(33,"Launch party","Google cars launch event");
		System.out.println(event.description);
	}
}
