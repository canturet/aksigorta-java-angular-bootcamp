package org;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

	private String name;

	private List<Classroom> classrooms;

	public Faculty(String name) {
		this.name = name;
		Classroom classroom1 = new Classroom("1101");
		Classroom classroom2 = new Classroom("1102");
		classrooms = new ArrayList<Classroom>();
		classrooms.add(classroom1);
		classrooms.add(classroom2);
	}

	public String toString() {
		return name + " " + classrooms;
	}

}
