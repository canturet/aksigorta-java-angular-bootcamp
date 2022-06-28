package org;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

	private String name;

	private List<Student> students = new ArrayList<Student>();

	public Lesson(String name) {
		this.name = name;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public String toString() {
		return name + " " + students;
	}

}
