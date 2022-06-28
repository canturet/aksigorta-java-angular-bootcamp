package org;

public class Application {

	public static void main(String[] args) {

		/* Aggregation */

		Lesson lesson = new Lesson("Ağ Programlama");

		Student student1 = new Student(1, "Can Türet");
		Student student2 = new Student(2, "Berat Bilgin");

		lesson.addStudent(student1);
		lesson.addStudent(student2);

		System.out.println(lesson);

		/* Composition */

		Faculty faculty = new Faculty("Bilgisayar Ve Bilişim Bilimleri Fakültesi");

		System.out.println(faculty);
	}

}
