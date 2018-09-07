package edu.mum.cs.cs401.labs.lab05.problem4.data;

public class DtoPersonalInfo {
	String id;
	String name;
	String birth;

	public DtoPersonalInfo(String id, String name, String birth) {
		this.id = id;
		this.name = name;
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBirth() {
		return birth;
	}
}
