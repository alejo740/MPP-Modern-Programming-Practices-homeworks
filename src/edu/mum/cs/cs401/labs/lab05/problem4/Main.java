package edu.mum.cs.cs401.labs.lab05.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import edu.mum.cs.cs401.labs.lab05.problem4.data.Database;
import edu.mum.cs.cs401.labs.lab05.problem4.data.DtoPersonalInfo;
import edu.mum.cs.cs401.labs.lab05.problem4.person.BirthInfo;
import edu.mum.cs.cs401.labs.lab05.problem4.person.Person;
import edu.mum.cs.cs401.labs.lab05.problem4.person.PersonWithBirthInfo;
import edu.mum.cs.cs401.labs.lab05.problem4.person.PersonWithBirthInfoFactory;

public class Main {

	public static void main(String[] args) {
		Collection<DtoPersonalInfo> data = Database.h.values();
		List<Person> people = new ArrayList<>();
		for (DtoPersonalInfo d : data) {
			PersonWithBirthInfo sr = PersonWithBirthInfoFactory.createPersonWithBirthInfo(d.getName(), d.getBirth());
			people.add(sr.getPerson());
		}
		
		for(Person person : people) {
			System.out.println(person.getName() + ": " + person.getBirthInfo().getDateOfBirth());
		}
	}

}
