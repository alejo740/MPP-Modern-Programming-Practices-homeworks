package edu.mum.cs.cs401.labs.lab09.problem7.partB;

public class Employee {
	private String firstName, lastName;

	private int salary;

	public Employee(String f, String l, int s) {
		this.firstName = f;
		this.lastName = l;
		this.salary = s;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("first name: ");
		sb.append(firstName);
		sb.append(" last name: ");
		sb.append(lastName);
		sb.append(" salary: ");
		sb.append("" + salary + ">");
		return sb.toString();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
