package test.standard1.prob2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {

	private Department[] depts;

	public Admin(Department[] depts) {
		if (depts == null || depts.length != 3)
			throw new IllegalArgumentException("Number of departments should be 3");

		this.depts = depts;
	}

	// implement
	public String hourlyCompanyMessage() {
		return Stream.of(depts).map(x -> {
			return Admin.format(x.getName(), x.nextMessage());
		}).collect(Collectors.joining());
	}

	public static String format(String name, String msg) {
		return new StringBuffer().append(name).append(": ").append(msg).append("\n").toString();
	}
}
