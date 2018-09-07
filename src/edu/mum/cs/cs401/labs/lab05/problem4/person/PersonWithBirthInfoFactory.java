package edu.mum.cs.cs401.labs.lab05.problem4.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

final public class PersonWithBirthInfoFactory {

	private PersonWithBirthInfoFactory() {
		
	}
	
	public static PersonWithBirthInfo createPersonWithBirthInfo(String name, String date) {
		Person person = new Person(name);
		BirthInfo birthInfo = new BirthInfo(LocalDate.parse(date));
		
		person.setBirthInfo(birthInfo);
		birthInfo.setPerson(person);
		
		return new PersonWithBirthInfoImpl(person, birthInfo);
	}
}
