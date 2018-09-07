package edu.mum.cs.cs401.labs.lab04.problemC;

import java.util.Date;

public class Order {
	private int orderNo;
	private Date orderDate;
	private int orderAmount;

	public Order(int orderNo, Date orderDate, int orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public int getOrderAmount() {
		return this.orderAmount;
	}

	public int getOrderNo() {
		return orderNo;
	}
}
