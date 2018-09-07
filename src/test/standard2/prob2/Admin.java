package test.standard2.prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		return list.stream().map(Employee::computeUpdatedBalanceSum).reduce(0.0, (x, y) -> x + y);
	}
}
