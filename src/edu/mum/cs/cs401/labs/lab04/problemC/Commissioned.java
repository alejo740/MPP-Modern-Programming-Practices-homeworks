package edu.mum.cs.cs401.labs.lab04.problemC;

import java.util.Date;
import java.util.ArrayList;
import java.time.YearMonth;
import java.time.ZoneId;

public class Commissioned extends Employee {
	private double baseSalary;
	private double commission;
	private ArrayList<Order> orderList = new ArrayList<Order>();

	public void addOrder(int orderNo, Date orderDate, int orderAmount) {
		Order addedOrder = new Order(orderNo, orderDate, orderAmount);
		orderList.add(addedOrder);
	}

	public Commissioned(double salary, double commission) {
		this.baseSalary = salary;
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double calcGrossPay() {
		int totalOrders = 0;
		
		for(Order order : orderList) {
			YearMonth orderYearMonth = YearMonth.from(order.getOrderDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			YearMonth lastMonth = YearMonth.now().minusMonths(1);
			
			if (orderYearMonth.equals(lastMonth)) {
				totalOrders += order.getOrderAmount();
			}
		}
		
		return baseSalary + (totalOrders * commission);
	}
}
