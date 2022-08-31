package com.emc.entities;

public class Event {
	public long id;
	public String name;
	public String description;
	public String starttime;
	public String endtime;
	public boolean started;
	
	public Event(long id,String name,String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
