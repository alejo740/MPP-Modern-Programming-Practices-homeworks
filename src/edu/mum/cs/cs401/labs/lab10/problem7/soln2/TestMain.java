package edu.mum.cs.cs401.labs.lab10.problem7.soln2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestMain {

	@Test
	public void filterEmployeesAndMergeInString() {
		List<Employee> emps = Arrays.asList(
				new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000), 
				new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000), 
				new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000), 
				new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000), 
				new Employee("Donald", "Trump", 100000));
		
		assertEquals("Alice Richards, Joe Stevens, John Sims, Steven Walters", Main.asString(emps));
		
	}
	
	@Test
	public void salaryGreaterThan100000() {
		Employee emp1 = new Employee("Payman", "Salek", 135000);
		assertEquals(true, Main.salaryGreaterThan100000(emp1));

		Employee emp2 = new Employee("Edwin", "Cobos", 80000);
		assertEquals(false, Main.salaryGreaterThan100000(emp2));
	}

	@Test
	public void lastNameLargerThanM() {
		Employee emp1 = new Employee("Edwin", "Cobos", 135000);
		assertEquals(false, Main.lastNameLargerThanM(emp1));

		Employee emp2 = new Employee("Payman", "Salek", 80000);
		assertEquals(true, Main.lastNameLargerThanM(emp2));
	}

	@Test
	public void fullName() {
		Employee emp1 = new Employee("Edwin", "Cobos", 135000);
		assertEquals("Edwin Cobos", Main.fullName(emp1));

		Employee emp2 = new Employee("Payman", "Salek", 80000);
		assertEquals("Payman Salek", Main.fullName(emp2));
	}
}
