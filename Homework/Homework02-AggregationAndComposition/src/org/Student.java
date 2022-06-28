package org;

public class Student {

	private int number;

	private String name;

	public Student(int number, String name) {
		this.name = name;
		this.number = number;
	}

	public String toString() {
		return number + " - " + name;
	}

}