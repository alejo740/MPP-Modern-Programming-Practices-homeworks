package edu.mum.cs.cs401.labs.lab05.problem4.person;

import java.time.LocalDate;

final public class BirthInfo {
	private LocalDate dateOfBirth;
	private Person person;

	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Person getPerson() {
		return person;
	}

	void setPerson(Person person) {
		this.person = person;
	}
}
