package edu.mum.cs.cs401.labs.lab02.problem2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private List<OrderLine> orderLines;

	public Order(int orderNum) {
		super();
		this.orderNum = orderNum;
		this.orderLines = new ArrayList<>();
		addOrderLine();
	}

	public void addOrderLine() {
		orderLines.add(new OrderLine(this));
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public int getOrderNum() {
		return orderNum;
	}

}
