package edu.mum.cs.cs401.labs.lab05.problem4.person;

final public class PersonWithBirthInfoImpl implements PersonWithBirthInfo {
	private Person person;
	private BirthInfo birthInfo;

	public PersonWithBirthInfoImpl(Person person, BirthInfo birthInfo) {
		this.person = person;
		this.birthInfo = birthInfo;
	}

	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

}
