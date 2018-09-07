package edu.mum.cs.cs401.labs.lab02.problem2.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private List<Student> students;

	public Section(Student students) {
		super();
		this.students = new ArrayList<>();

	}

	public void addStudent(String name) {
		students.add(new Student(name));
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
