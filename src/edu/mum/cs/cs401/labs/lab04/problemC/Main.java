package edu.mum.cs.cs401.labs.lab04.problemC;

import java.time.YearMonth;

public class Main {

	public static void main(String[] args) {
		Employee employeeHourly = new Hourly(100, 40);
		employeeHourly.calcCompensation(YearMonth.parse("2015-12"));
		
		Employee employeeMonthly = new Salaried(3000);
		employeeMonthly.calcCompensation(YearMonth.parse("2014-06"));
		
		Employee employeeCommissioned = new Commissioned(2500, 1500);
		employeeCommissioned.calcCompensation(YearMonth.parse("2014-06"));
	}

}
