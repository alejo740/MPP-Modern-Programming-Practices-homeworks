package edu.mum.cs.cs401.labs.lab03.problem1.composition;

public class PersonWithJob {

	private double salary;
	private Person person;

	PersonWithJob(Person p, double s) {
		person = p;
		salary = s;
	}

	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}

	public double getSalary() {
		return salary;
	}

	public Person getPerson() {
		return person;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) aPerson;
		boolean isEqual = this.person.getName().equals(p.person.getName()) && this.getSalary() == p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.getPerson().equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1.getPerson()));
	}

}
