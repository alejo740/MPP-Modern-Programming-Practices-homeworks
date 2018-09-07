package edu.mum.cs.cs401.labs.lab02.problem2.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Section> sections;

	public Student(String name) {
		super();
		this.name = name;
		sections = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	public void addSection() {
		sections.add(new Section(this));
	}

}
