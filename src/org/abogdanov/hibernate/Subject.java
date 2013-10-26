package org.abogdanov.hibernate;

public class Subject {
	private int id;
	private String name;
	private int hours;

	public Subject() {
	}

	public Subject(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}